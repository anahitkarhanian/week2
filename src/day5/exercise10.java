package day5;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0,j = 0; i < n; j++) {
            if(j < m){
                matrix[i][j] = i * j;
            } else {
                i++;
                j = -1;
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
