class MyClass {
 // This is a static method
 static void displayMessage() {
 System.out.println("Hello from the static method!");
 }
}
public class Main {
 public static void main(String[] args) {
 // Call the static method on the class itself, not on an instance of the class
 MyClass.displayMessage(); // Output: Hello from the static method!
 }
}
