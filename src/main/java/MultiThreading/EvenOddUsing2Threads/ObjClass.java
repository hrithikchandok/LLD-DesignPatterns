package MultiThreading.EvenOddUsing2Threads;

class Evvodd1 implements Runnable {
    private int counter = 1;
    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                if (counter % 2 == 0)
                    System.out.println("Pong -> " + counter + " name " + Thread.currentThread().getName());
                else
                    System.out.println("Ping -> " + counter + " name " + Thread.currentThread().getName());
                counter++;
                try {
                    Thread.sleep(1000); // Simulate processing delay
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                notify(); // Wake up the other thread

                try {
                    wait(); // Put this thread to wait
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

public class ObjClass {
    public static void main(String[] args) {
        Evvodd1 ev = new Evvodd1(); // Shared object
        Thread t1 = new Thread(ev, "Thread-1");
        Thread t2 = new Thread(ev, "Thread-2");

        t1.start();
        t2.start();
    }
}
