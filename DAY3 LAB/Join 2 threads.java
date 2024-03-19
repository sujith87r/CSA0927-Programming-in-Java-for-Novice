public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            // T1 logic
            // Check if the thread contains even numbers
            boolean containsEven = true; // Example condition
            if (containsEven) {
                try {
                    Thread.sleep(10000); // Sleep for 10000 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            // T2 logic
            // Check if the thread contains even numbers
            boolean containsEven = true; // Example condition
            if (containsEven) {
                try {
                    Thread.sleep(5000); // Sleep for 5000 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
