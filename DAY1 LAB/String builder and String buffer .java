public class StringBuilderVsStringBuffer {
 public static void main(String[] args) {
 // StringBuilder Example
 StringBuilder stringBuilder = new StringBuilder("Hello");
 stringBuilder.append(" World");
 System.out.println("StringBuilder Example:");
 System.out.println("StringBuilder: " + stringBuilder);
 
 // StringBuffer Example
 StringBuffer stringBuffer = new StringBuffer("Hello");
 stringBuffer.append(" World");
 System.out.println("\nStringBuffer Example:");
 System.out.println("StringBuffer: " + stringBuffer);
 
 // Performance Comparison
 int iterations = 1000000;
 
 long startTimeStringBuilder = System.currentTimeMillis();
 StringBuilder stringBuilderConcat = new StringBuilder();
 for (int i = 0; i < iterations; i++) {
 stringBuilderConcat.append("Hello");
 }
 long endTimeStringBuilder = System.currentTimeMillis();
 long durationStringBuilder = endTimeStringBuilder - startTimeStringBuilder;
 System.out.println("\nPerformance Comparison:");
 System.out.println("StringBuilder Time: " + durationStringBuilder + " milliseconds");
 
 long startTimeStringBuffer = System.currentTimeMillis();
 StringBuffer stringBufferConcat = new StringBuffer();
 for (int i = 0; i < iterations; i++) {
 stringBufferConcat.append("Hello");
 }
 long endTimeStringBuffer = System.currentTimeMillis();
 long durationStringBuffer = endTimeStringBuffer - startTimeStringBuffer;
 System.out.println("StringBuffer Time: " + durationStringBuffer + " milliseconds");
 }

}
