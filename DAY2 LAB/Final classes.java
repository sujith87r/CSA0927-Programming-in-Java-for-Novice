// This is a final class
final class FinalClass {
 void display() {
 System.out.println("Hello from FinalClass!");
 }
}
// This class cannot extend the final class
// class Child extends FinalClass {
// // Some code...
// }
public class Main {
 public static void main(String[] args) {
 FinalClass obj = new FinalClass();
 obj.display(); // Output: Hello from FinalClass!
 }
}
