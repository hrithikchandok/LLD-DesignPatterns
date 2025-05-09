public class HitCounter {

    private final int[] timestamps;
    private final int[] hits;
    private static final int WINDOW_SIZE = 300;

    // Constructor initializes the arrays
    public HitCounter() {
        this.timestamps = new int[WINDOW_SIZE];
        this.hits = new int[WINDOW_SIZE];
    }

    /**
     * Record a hit at the given timestamp (in seconds).
     */
    public void hit(int timestamp) {
        int index = timestamp % WINDOW_SIZE;
        if (timestamps[index] == timestamp) {
            hits[index]++;
        } else {
            timestamps[index] = timestamp;
            hits[index] = 1;
        }
    }

    /**
     * Return the number of hits in the past 300 seconds.
     */
    public int getHits(int timestamp) {
        int totalHits = 0;
        for (int i = 0; i < WINDOW_SIZE; i++) {
            if (timestamp - timestamps[i] < WINDOW_SIZE) {
                totalHits += hits[i];
            }
        }
        return totalHits;
    }

    // Sample driver code to test the implementation
    public static void main(String[] args) {
        HitCounter counter = new HitCounter();

        // Simulate some hits
        counter.hit(1);
        counter.hit(2);
        counter.hit(3);
        System.out.println("Hits at t=4: " + counter.getHits(4)); // Output: 3

        counter.hit(300);
        System.out.println("Hits at t=300: " + counter.getHits(300)); // Output: 4

        System.out.println("Hits at t=301: " + counter.getHits(301)); // Output: 3 (1 expired)
    }
}
