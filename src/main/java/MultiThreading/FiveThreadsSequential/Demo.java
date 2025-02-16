package MultiThreading.FiveThreadsSequential;

class Pnt implements Runnable {
    int index;
    Pnt(int index)
    {
        this.index = index;
    }
    public void run() {
       for(int i=1; i<=5; i++)
       {
           System.out.println("Pnt -> " + index +" name "+Thread.currentThread().getName());
       }
    }
}
public class Demo
{
    public static void main(String[] args) throws InterruptedException {
//        Let’s create a task which prints 1 to 5 using 5 Threads sequentially
        Thread t1=new Thread(new Pnt(0));
        Thread t2=new Thread(new Pnt(1));
        Thread t3=new Thread(new Pnt(2));
        Thread t4=new Thread(new Pnt(3));
        Thread t5=new Thread(new Pnt(4));
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();
    }
}
