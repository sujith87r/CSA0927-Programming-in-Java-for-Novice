public class Main {
    public static void main(String[] args) {
        double x = 0; // Example: 0 or any negative number
        double result;

        if (x > 0) {
            result = Math.log(x);
            System.out.println("Logarithm of " + x + " is: " + result);
        } else {
            System.out.println("Logarithm of " + x + " is undefined.");
        }
    }
}
