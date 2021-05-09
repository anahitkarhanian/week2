package day4;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int k = 0;

        while (top <= n / 2) {
            for (int j = left; j <= right; j++) {
                matrix[top][j] = k++;
            }
           top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = k++;
            }
            right--;
            for (int j = right; j >= left; j--) {
                matrix[bottom][j] = k++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = k++;
            }
            left++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
