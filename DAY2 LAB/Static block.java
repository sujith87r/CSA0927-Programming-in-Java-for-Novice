class MyClass {
 static int num;
 // This is a static block
 static {
 num = 10;
 System.out.println("Static block executed. num: " + num);
 }
}
public class Main {
 public static void main(String[] args) {
 // The static block will be executed when the MyClass class is loaded
 MyClass obj = new MyClass();
 }
}
