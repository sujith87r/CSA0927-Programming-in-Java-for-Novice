public class PassingCurrentObjectAsParameter {
 private int number;
 public PassingCurrentObjectAsParameter(int number) {
 this.number = number;
 }
 public void processData(PassingCurrentObjectAsParameter anotherObject) {
 int sum = this.number + anotherObject.number;
 System.out.println("Sum: " + sum);
 }
 public static void main(String[] args) {
 PassingCurrentObjectAsParameter obj1 = new 
PassingCurrentObjectAsParameter(30);
 PassingCurrentObjectAsParameter obj2 = new 
PassingCurrentObjectAsParameter(15);
 obj1.processData(obj2);
 }
}
