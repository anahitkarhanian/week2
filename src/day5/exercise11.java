package day5;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int matrix[][] = new int[n][m];

        int num = 0;

        for ( int k = 0; k < n * m; k++){
            for (int i = 0; i < n; i++) {
                int j = k - i;
                if(j >= 0 && j < m) {
                    matrix[i][j] = num;
                    num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
