package MultiThreading.PingPong2Threads;

public class PingPong {
    private int counter = 1; // Shared counter
    private final int MAX_COUNT = 10; // Change as needed

    public void printPing() throws InterruptedException {
        synchronized (this) {
            while (counter < MAX_COUNT) {
                while (counter % 2 == 0) { // Wait if it's not "Ping"'s turn
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Thread.sleep(2000);
                System.out.println("Ping -> " + counter);
                counter++;
                notify(); // Wake up the other thread
            }
        }
    }

    public void printPong() throws InterruptedException {
        synchronized (this) {
            while (counter < MAX_COUNT) {
                while (counter % 2 == 1) { // Wait if it's not "Pong"'s turn
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Thread.sleep(2000);
                System.out.println("Pong -> " + counter);
                counter++;
                notify(); // Wake up the other thread
            }
        }
    }

    public static void main(String[] args) {
        PingPong pingPong = new PingPong();

        Thread t1 = new Thread(() -> {
            try {
                pingPong.printPing();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread-Ping");
        Thread t2 = new Thread(() -> {
            try {
                pingPong.printPong();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread-Pong");

        t1.start();
        t2.start();
    }
}
