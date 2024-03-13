public class StringMethodsAndConstructors {
 public static void main(String[] args) {
 // String Constructors
 String str1 = new String(); // Empty String
 String str2 = new String("Hello"); // String with specified content
 char[] charArray = {'W', 'o', 'r', 'l', 'd'};
 String str3 = new String(charArray); // String from char array
 byte[] byteArray = {65, 66, 67, 68, 69};
 String str4 = new String(byteArray); // String from byte array
 
 System.out.println("String Constructors:");
 System.out.println("str1: " + str1);
 System.out.println("str2: " + str2);
 System.out.println("str3: " + str3);
 System.out.println("str4: " + str4);
 
 // String Methods
 String original = "Hello World";
 System.out.println("\nString Methods:");
 System.out.println("Original String: " + original);
 
 // Length
 System.out.println("Length: " + original.length());
 
 // Concatenation
 String concatString = original.concat("!");
 System.out.println("Concatenated String: " + concatString);
 
 // Substring
 String substring = original.substring(6);
 System.out.println("Substring from index 6: " + substring);
 
 // Character extraction
 char charAt5 = original.charAt(5);
 System.out.println("Character at index 5: " + charAt5);
 
 // Index of a character
 int indexOfW = original.indexOf('W');
 System.out.println("Index of 'W': " + indexOfW);
 
 // Index of a character starting from a specific index
 int indexOfl = original.indexOf('l', 4);
 System.out.println("Index of 'l' after index 4: " + indexOfl);
 
 // Replace
 String replacedString = original.replace('l', 'L');
 System.out.println("String after replacing 'l' with 'L': " + replacedString);
 
 // Convert to uppercase
 String upperCaseString = original.toUpperCase();
 System.out.println("Uppercase String: " + upperCaseString);
 
 // Convert to lowercase
 String lowerCaseString = original.toLowerCase();
 System.out.println("Lowercase String: " + lowerCaseString);
 
 // Trim leading and trailing spaces
 String stringWithSpaces = " Trimmed String ";
 String trimmedString = stringWithSpaces.trim();
 System.out.println("Trimmed String: '" + trimmedString + "'");
 
 // String comparison
 String str5 = "Hello";
 String str6 = "hello";
 System.out.println("Comparison of str2 and str5 (case sensitive): " + str2.equals(str5));
 System.out.println("Comparison of str2 and str6 (case insensitive): " + 
str2.equalsIgnoreCase(str6));
 
 // Check if starts with/ends with
 System.out.println("Does str2 start with 'He'?: " + str2.startsWith("He"));
 System.out.println("Does str2 end with 'lo'?: " + str2.endsWith("lo"));
 }
}
