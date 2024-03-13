public class LogicalGates {
 
 // OR gate implementation
 public static boolean OR(boolean input1, boolean input2) {
 return input1 || input2;
 }
 
 // AND gate implementation
 public static boolean AND(boolean input1, boolean input2) {
 return input1 && input2;
 }
 public static void main(String[] args) {
 // Testing OR gate
 boolean input1 = true;
 boolean input2 = false;
 System.out.println("OR gate:");
 System.out.println(input1 + " OR " + input2 + " = " + OR(input1, input2));
 
 // Testing AND gate
 input1 = true;
 input2 = false;
 System.out.println("\nAND gate:");
 System.out.println(input1 + " AND " + input2 + " = " + AND(input1, input2));
 }
}
