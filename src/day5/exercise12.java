package day5;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0,k = 0; i < n; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < m; j++,k++) {
                    matrix[i][j] = k;
                }
            } else {
                for (int j = m - 1; j >= 0; j--,k++) {
                    matrix[i][j] = k;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
