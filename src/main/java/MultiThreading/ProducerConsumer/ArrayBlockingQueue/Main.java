package MultiThreading.ProducerConsumer.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable
{
    ArrayBlockingQueue<Integer> queue;
    int size;
    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run()
    {
       for(int i=0;i<10;i++)
       {
           try {
               queue.put(i);// Blocking call if queue is full
               System.out.println("produced ->"+i);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
class Consumer implements Runnable
{
    ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run()
    {

        while(true)
       {
           try {
               Integer taken = queue.take();// Blocks until an item is available
               System.out.println("Consumed "+taken);

           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
public class Main {

    public static void main(String[] args)
    {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        Producer pro=new Producer(queue);
        Consumer cons=new Consumer(queue);
        Thread t1=new Thread(pro);
        Thread t2=new Thread(cons);
        t1.start();
        t2.start();

    }
}
