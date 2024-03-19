class ArmstrongThread extends Thread {
    @Override
    public void run() {
        // Implement Armstrong number logic here
        // Use thread life cycle methods like start(), sleep(), join(), etc.
    }
}

class FibonacciThread extends Thread {
    @Override
    public void run() {
        // Implement Fibonacci series logic here
        // Use thread life cycle methods like start(), sleep(), join(), etc.
    }
}

public class Main {
    public static void main(String[] args) {
        ArmstrongThread t1 = new ArmstrongThread();
        FibonacciThread t2 = new FibonacciThread();
        
        t1.start();
        t2.start();
    }
}
