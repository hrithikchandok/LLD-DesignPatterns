package TaskManagement;

import java.time.LocalDate;
import java.util.List;

public class Demo
{
    public static void main(String[] args) {

        TaskManager taskManager = TaskManager.getInstance();

        // Create users
        User user1 = new User(1, "John Doe", "john@example.com","<PASSWORD>");
        User user2 = new User(2, "Jane Smith", "jane@example.com","<PASSWORD>");

        // Create tasks
        Task task1 = new Task(1, "Task 1", "Description 1",Priority.LOW, Status.NOT_STARTED,user1, LocalDate.now());
        Task task2 = new Task(2, "Task 2", "Description 2", Priority.HIGH,Status.NOT_STARTED, user2,LocalDate.now());
        Task task3 = new Task(3, "Task 3", "Description 3", Priority.MEDIUM,Status.NOT_STARTED, user1,LocalDate.now());

        // Add tasks to the task manager
        taskManager.createTask(task1);
        taskManager.createTask(task2);
        taskManager.createTask(task3);

        // Update a task
        task2.setTaskDescription("Updated description");
        taskManager.updateTask(task2);

        // Search tasks
        List<Task> searchResults = taskManager.searchTask("Task");
        System.out.println("Search Results:");
        for (Task task : searchResults) {
            System.out.println(task.getTaskDescription());
        }

        // Filter tasks
        List<Task> filteredTasks = taskManager.filterTasks(Status.NOT_STARTED, LocalDate.now().minusDays(10), LocalDate.now(), Priority.HIGH);
        System.out.println("Filtered Tasks:");
        for (Task task : filteredTasks) {
            System.out.println(task.getTaskDescription());
        }

        // Mark a task as completed
        taskManager.markTaskAsCompleted("1");

        // Get task history for a user
        List<Task> taskHistory = taskManager.getTaskHistory(user1);
        System.out.println("Task History for " + user1.getName() + ":");
        for (Task task : taskHistory) {
            System.out.println(task.getTaskDescription());
        }

        // Delete a task
        taskManager.deleteTask(3);
    }
}
