public class MedianAtMeetingPoint {
 public static void main(String[] args) {
 int[] normalOrder = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 int[] reverseOrder = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
 int median = -1; // Initialize median to a default value
 // Iterate through both arrays simultaneously
 for (int i = 0, j = reverseOrder.length - 1; i < normalOrder.length && j >= 0; i++, j--) {
 // If the current element from normalOrder array is greater than or equal to the 
current element
 // from reverseOrder array, we have reached or passed the meeting point of the 
median
 if (normalOrder[i] >= reverseOrder[j]) {
 median = normalOrder[i]; // Set the median value
 break; // Exit the loop
 }
 }
 System.out.println("Median at meeting point: " + median);
 }
}
