class MyClass {
 int a;
 int b;
 // Default constructor
 MyClass() {
 this.a = 10;
 this.b = 15;
 }
 // Parameterized constructor
 MyClass(int a, int b) {
 this.a = a;
 this.b = b;
 }
 void disp() {
 System.out.println("a = " + a + ", b = " + b);
 }
}
public class Main {
 public static void main(String[] args) {
 // Create an object using the default constructor
 MyClass obj1 = new MyClass();
 obj1.disp();
 // Create an object using the parameterized constructor
 MyClass obj2 = new MyClass(20, 25);
 obj2.disp();
 }
}
