package MultiThreading.RenterantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class RetPingPong implements Runnable
{
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();
     private static  int counter = 0;
    void pong(int i )
    {
        lock.lock();
        try {
            while (counter % 2 == 0) {
                condition.await();
            }
            Thread.sleep(2000);
            System.out.println("Pong -> " + i +" name "+Thread.currentThread().getName());
            counter++;
            condition.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
    void ping(int i)
    {
        lock.lock();
        try {
            while (counter % 2 == 1) {
                condition.await();
            }
            Thread.sleep(2000);
            System.out.println("Ping -> " + i +" name "+Thread.currentThread().getName());
            counter++;
            condition.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
    @Override
    public void run()
    {
        if(Thread.currentThread().getName().equals("Ping"))
        {
            for(int i=1; i<=10; i++)
            {

                    ping(i);

            }
        }
        if(Thread.currentThread().getName().equals("Pong"))
        {
            for(int i=1; i<=10; i++)
            {

                    pong(i);

            }
        }

    }
}
public class Demo {
    public static void main(String[] args)
    {
        RetPingPong p = new RetPingPong();
        RetPingPong p2 = new RetPingPong();
        Thread Ping = new Thread(p,"Ping");
        Thread Pong = new Thread(p2,"Pong");
        Ping.start();
        Pong.start();
    }
}
