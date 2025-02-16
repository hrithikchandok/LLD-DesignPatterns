package MultiThreading.EvenOddUsing2Threads;

class EvOdd implements Runnable {

    int counter=1;
    Object obj=new Object();
    EvOdd(Object obj)
    {
        this.obj=obj;
    }
    @Override
    public void run() {
        synchronized (obj)
        {
            while(true) {
                if(counter%2==0)
                System.out.println("Ping -> " + counter +" name "+Thread.currentThread().getName());
                else if(counter%2==1)
                    System.out.println("Pong -> " + counter+" name "+Thread.currentThread().getName());
                counter++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                obj.notify();
                try {
                    obj.wait(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
public class EvenOdd
{
    public static void main(String[] args) {
       Object obj= new Object();
        EvOdd ev=new EvOdd(obj);
       Thread t1=new Thread(ev);
       Thread t2=new Thread(ev);
       t1.start();
       t2.start();

    }
}
