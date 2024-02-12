public class Arthimetic_exception {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println((c));
        } catch (Exception e) {
            System.out.print("There is an exception :" + e);
        }
    }
}
