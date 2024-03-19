public class ReturningCurrentObject {
 private int number;
 public ReturningCurrentObject setNumberAndReturn(int number) {
 this.number = number;
 return this;
 }
 public void displayValue() {
 System.out.println("Number: " + number);
 }
 public static void main(String[] args) {
 ReturningCurrentObject obj = new ReturningCurrentObject();
 obj.setNumberAndReturn(10).displayValue();
 }
}
