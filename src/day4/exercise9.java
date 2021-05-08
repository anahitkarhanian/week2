package day4;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n-1;
        int up = 0;
        int down = n-1;
        while (right != 0){
            for (int j = left; j <= right; j++) {
                matrix[up][j] = 1;
            }
            for (int i = up; i <= down; i++) {
                matrix[i][down] = 1;
            }
            for (int j = right; j >= left; j--) {
                matrix[right][j] = 1;
            }
            up += 2;
            for (int i = down; i >= up; i--) {
                matrix[i][left] = 1;
            }

            left += 2;
            right -= 2;
            down -= 2;
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

    }
}
