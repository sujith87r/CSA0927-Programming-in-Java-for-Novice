class Parent {
 // This is a final method
 final void display() {
 System.out.println("Hello from Parent!");
 }
}
class Child extends Parent {
 // This method cannot override the final method in the parent class
 // void display() {
 // System.out.println("Hello from Child!");
 // }
 // New method in Child class
 void sayHello() {
 System.out.println("Hello from Child!");
 }
}
public class Main {
 public static void main(String[] args) {
 Child obj = new Child();
 obj.display(); // Output: Hello from Parent!
 obj.sayHello(); // Output: Hello from Child!
 }
}
