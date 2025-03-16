package TaskManagement;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TaskManager
{
    //create task
    //update task
    //delete task
    //remove task
    //sort the taks by priority , deu date , user
    //user assigned to task
    // map taskid-> task
    //map useris -> user
    // list of task
     List<Task> taskList=new ArrayList<>();
     Map<Integer,Task > mp=new ConcurrentHashMap<>();
     Map<Integer,List<Task>>mp2=new ConcurrentHashMap<>();
     private static TaskManager instance=null;
     static TaskManager getInstance()
     {
         if(instance==null)
         {
             instance=new TaskManager();
         }
        return instance;
     }
    void createtask(Task task)
     {
        mp.put(task.taskId,task);
        assignedTasktoUser(task.getAssignedTo(),task);
     }
    private void assignedTasktoUser(User assignedTo, Task task)
    {
        List<Task> tasks;
        if(mp2.getOrDefault(assignedTo.getUser_id(),null)!=null)
        {
             tasks= mp2.get(assignedTo.getUser_id());
             tasks.add(task);
        }
        else
        {
          tasks = Arrays.asList(task);
        }
        mp2.put(assignedTo.getUser_id(),tasks);
    }
    public void deleteTask(Integer taskId) {
        Task task = mp.remove(taskId);
        if (task != null) {
            unassignTaskFromUser(task.getAssignedTo(), task);
        }
    }
    public void unassignTaskFromUser(User assignedUser, Task task)
    {
       List<Task> tasks = mp2.get(assignedUser.getUser_id());
        tasks.remove(task);
        if (tasks.isEmpty()) {
            mp2.remove(assignedUser.getUser_id());
        }
    }
    List<Task> searchTask(String keyword)
    {
        List<Task>matchingTasks=new ArrayList<>();
        for(Task task:taskList)
        {
            if(task.getTaskName().contains(keyword)|| task.getTaskDescription().contains(keyword))
            {
                matchingTasks.add(task);
            }
        }
        return matchingTasks;
    }
    public List<Task> filterTasks(Status status, LocalDate startDate, LocalDate endDate, Priority priority) {
        List<Task> filteredTasks = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getStatus() == status &&
                    task.getDueDate().compareTo(startDate) >= 0 &&
                    task.getDueDate().compareTo(endDate) <= 0 &&
                    task.getPriority() == priority) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }
    public void updateTask(Task updatedTask) {
        Task existingTask = mp.get(updatedTask.getTaskId());
        if (existingTask != null) {
            synchronized (existingTask) {
                existingTask.setTaskName(updatedTask.getTaskName());
                existingTask.setTaskDescription(updatedTask.getTaskDescription());
                existingTask.setDueDate(updatedTask.getDueDate());
                existingTask.setPriority(updatedTask.getPriority());
                existingTask.setStatus(updatedTask.getStatus());
                User previousUser = existingTask.getAssignedTo();
                User newUser = updatedTask.getAssignedTo();
                if (!previousUser.equals(newUser)) {
                    unassignTaskFromUser(previousUser, existingTask);
                    assignedTasktoUser(newUser, existingTask);
                }
            }
        }
    }
    public List<Task> getTaskHistory(User user) {
        return new ArrayList<>(mp2.getOrDefault(user.getUser_id(), new ArrayList<>()));
    }

    public void markTaskAsCompleted(String taskId) {
        Task task = mp.get(taskId);
        if (task != null) {
            synchronized (task) {
                task.setStatus(Status.COMPLETED);
            }
        }
    }
    public void createTask(Task task1)
    {
        taskList.add(task1);

    }
}
