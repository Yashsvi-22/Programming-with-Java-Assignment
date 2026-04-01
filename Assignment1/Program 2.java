import java.util.Scanner;

class Matrix {

    int rows, cols;
    int[][] mat;

    Matrix(int r, int c) {
        rows = r;
        cols = c;
        mat = new int[r][c];
    }

    void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }

    Matrix multiply(Matrix m2) {

        Matrix result = new Matrix(rows, m2.cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < m2.cols; j++) {
                for (int k = 0; k < cols; k++) {
                    result.mat[i][j] += mat[i][k] * m2.mat[k][j];
                }
            }
        }

        return result;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        Matrix m1 = new Matrix(r1, c1);
        m1.inputMatrix();

        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        Matrix m2 = new Matrix(r2, c2);
        m2.inputMatrix();

        System.out.println("\nFirst Matrix:");
        m1.display();

        System.out.println("\nSecond Matrix:");
        m2.display();

        System.out.println("\nTranspose of First Matrix:");
        m1.transpose();

        if (c1 == r2) {
            Matrix result = m1.multiply(m2);

            System.out.println("\nMultiplication Result:");
            result.display();
        } else {
            System.out.println("\nMatrix multiplication not possible.");
        }
    }
}
