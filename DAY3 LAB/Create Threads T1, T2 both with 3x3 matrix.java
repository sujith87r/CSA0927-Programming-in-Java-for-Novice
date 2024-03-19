class MatrixThread extends Thread {
    private int[][] matrix;
    private int sum;

    public MatrixThread(int[][] matrix) {
        this.matrix = matrix;
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        // Calculate the sum of elements in the matrix
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        MatrixThread t1 = new MatrixThread(matrix1);
        MatrixThread t2 = new MatrixThread(matrix2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sum1 = t1.getSum();
        int sum2 = t2.getSum();
        int totalSum = sum1 + sum2;

        System.out.println("Total sum of elements in both matrices: " + totalSum);
    }
}
