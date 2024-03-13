public class DataTypeConversion {
 public static void main(String[] args) {
 // Implicit conversion (Widening)
 int intValue = 10;
 long longValue = intValue; // int to long
 float floatValue = longValue; // long to float
 double doubleValue = floatValue; // float to double
 
 System.out.println("Implicit Conversion (Widening):");
 System.out.println("int to long: " + longValue);
 System.out.println("long to float: " + floatValue);
 System.out.println("float to double: " + doubleValue);
 
 // Explicit conversion (Narrowing)
 double doubleNum = 123.456;
 float floatNum = (float) doubleNum; // double to float
 long longNum = (long) floatNum; // float to long
 int intNum = (int) longNum; // long to int
 
 System.out.println("\nExplicit Conversion (Narrowing):");
 System.out.println("double to float: " + floatNum);
 System.out.println("float to long: " + longNum);
 System.out.println("long to int: " + intNum);
 
 // Overflow and Underflow
 int largeInt = Integer.MAX_VALUE;
 short shortNum = (short) largeInt; // int to short (overflow)
 byte byteNum = (byte) largeInt; // int to byte (overflow)
 
 System.out.println("\nOverflow and Underflow:");
 System.out.println("int to short (Overflow): " + shortNum);
 System.out.println("int to byte (Overflow): " + byteNum);
 
 int smallInt = Integer.MIN_VALUE;
 short shortNum2 = (short) smallInt; // int to short (underflow)
 byte byteNum2 = (byte) smallInt; // int to byte (underflow)
 
 System.out.println("int to short (Underflow): " + shortNum2);
 System.out.println("int to byte (Underflow): " + byteNum2);
 }
}
