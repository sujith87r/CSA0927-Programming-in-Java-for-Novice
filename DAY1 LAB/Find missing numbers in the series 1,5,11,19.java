public class MissingNumbersSeries {
 public static void main(String[] args) {
 int[] series = {1, 5, 11, 19};
 System.out.println("Missing numbers in the series:");
 for (int i = 0; i < series.length - 1; i++) {
 int diff = series[i + 1] - series[i]; // Calculate the difference between consecutive 
numbers
 if (diff > 1) {
 for (int j = 1; j < diff; j++) {
 System.out.println(series[i] + j); // Print the missing numbers
