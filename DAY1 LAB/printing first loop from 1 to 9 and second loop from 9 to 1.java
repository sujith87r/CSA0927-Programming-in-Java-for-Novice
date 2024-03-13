public class MatrixPopulate {
 public static void main(String[] args) {
 // Define the size of the matrices
 int rows = 9;
 int cols = 9;
 
 // Define matrices A and B
 int[][] matrixA = new int[rows][cols];
 int[][] matrixB = new int[rows][cols];
 
 // Populate matrix A with the first loop (1 to 9)
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 matrixA[i][j] = i * cols + j + 1;
 }
 }
 
 // Populate matrix B with the second loop (9 to 1)
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 matrixB[i][j] = (rows - i) * cols - j;
 }
 }
 
 // Print matrix A
 System.out.println("Matrix A:");
 printMatrix(matrixA);
 
 // Print matrix B
 System.out.println("\nMatrix B:");
 printMatrix(matrixB);
 }
 
 // Method to print a matrix
 public static void printMatrix(int[][] matrix) {
 for (int[] row : matrix) {
 for (int num : row) {
 System.out.print(num + "\t");
 }
 System.out.println();
 }
 }
}
