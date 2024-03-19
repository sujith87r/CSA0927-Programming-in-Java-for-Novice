class MyClass {
 // This is a final variable
 final int num = 10;
 void display() {
 System.out.println("num: " + num);
 }
}
public class Main {
 public static void main(String[] args) {
 MyClass obj = new MyClass();
 obj.display(); // Output: num: 10
 }
}
