package day4;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int indexI = 0;
        int indexJ = 0;
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               if( matrix[i][j] > max){
                   max = matrix[i][j];
                   indexI = i;
                   indexJ = j;
               }
            }
        }
        System.out.println(max + " " + indexI + " " + indexJ);

    }
}
