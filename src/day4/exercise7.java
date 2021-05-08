package day4;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[m][k];
        int[][] matrixX = new int[n][k];
        int sum = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < m; l++){
                    matrixX[i][j] += matrix1[i][l] * matrix2[l][j];
                }
            }
        }
        for (int i = 0; i < matrixX.length; i++) {
            System.out.println();
            for (int j = 0; j < matrixX[i].length; j++) {
                System.out.print(matrixX[i][j] + " ");
            }
        }

    }
}
