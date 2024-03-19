public class ReferencingInstanceVariable {
 private int number;
 public void setNumber(int number) {
 // Use 'this' to refer to the instance variable
 this.number = number;
 }
 public int getNumber() {
 return this.number;
 }
 public static void main(String[] args) {
 ReferencingInstanceVariable obj = new ReferencingInstanceVariable();
 obj.setNumber(42);
 System.out.println("Number: " + obj.getNumber());
 }
}
