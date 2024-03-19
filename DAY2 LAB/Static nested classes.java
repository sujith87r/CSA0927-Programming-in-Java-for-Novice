class OuterClass {
 static int outerNum = 10;
 // This is a static nested class
 static class StaticNestedClass {
 void display() {
 System.out.println("outerNum from OuterClass: " + outerNum);
 }
 }
}
public class Main {
 public static void main(String[] args) {
 // Create an instance of the static nested class
 OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
 nestedObj.display(); // Output: outerNum from OuterClass: 10
 }
}
