public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            // Thread 1 logic
        });

        Thread t2 = new Thread(() -> {
            // Thread 2 logic
        });

        long startTime = System.currentTimeMillis();
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        if (t1.getState() == Thread.State.TIMED_WAITING && t2.getState() == Thread.State.TIMED_WAITING) {
            System.out.println("Both threads waited for the same amount of time.");
        } else if (t1.getState() == Thread.State.TIMED_WAITING) {
            System.out.println("Thread 1 waited longer.");
        } else if (t2.getState() == Thread.State.TIMED_WAITING) {
            System.out.println("Thread 2 waited longer.");
        } else {
            System.out.println("Both threads did not wait.");
        }

        System.out.println("Total execution time: " + (endTime - startTime) + " milliseconds");
    }
}
