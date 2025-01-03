package JavaPractice;

import java.util.Scanner;

abstract class MatrixOperation {
    abstract void performOperation(int[][] matrix1, int[][] matrix2, int N);
}

class MatrixAddition extends MatrixOperation {

    @Override
    void performOperation(int[][] matrix1, int[][] matrix2, int N) {

        int[][] result = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the matrix
        int N = scanner.nextInt();

        // Initialize two matrices
        int[][] matrix1 = new int[N][N];
        int[][] matrix2 = new int[N][N];

        // Read the first matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Read the second matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Create an instance of MatrixAddition and perform the operation
        MatrixAddition matrixAddition = new MatrixAddition();
        matrixAddition.performOperation(matrix1, matrix2, N);

        scanner.close();
    }
}
