class MyClass {
 // This is a static variable
 static int count = 0;
 MyClass() {
 // Increment the static variable for each new instance of MyClass
 count++;
 }
 void displayCount() {
 System.out.println("Number of instances created: " + count);
 }
}
public class Main {
 public static void main(String[] args) {
 MyClass obj1 = new MyClass();
 obj1.displayCount(); // Output: Number of instances created: 1
 MyClass obj2 = new MyClass();
 obj2.displayCount(); // Output: Number of instances created: 2
 }
}
