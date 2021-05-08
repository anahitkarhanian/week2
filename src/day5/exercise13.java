package day5;

import java.util.Random;
import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int[][] matrix90 = new int[m][n];
        int[][] matrix180 = new int[n][m];

        int k = 0;

        //fill the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = k;
                k++;
            }
        }

        //print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //transporting matrix by 90 degrees
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix90[i][j] = matrix[n - j - 1][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix180[i][j] = matrix[n - i - 1][m - j - 1];
                //or matrix180[i][j] = matrix90[n - j - 1][i];
            }
        }

        System.out.println("push 1 for transporting matrix by 90 " +
                "degrees or push 2 for transporting matrix by 180 degrees");

        int choice = scanner.nextInt();

        if (choice == 1) {
            for (int i = 0; i < m; i++) {
                System.out.println();
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix90[i][j] + " ");
                }
            }
        } else if (choice == 2){
            for (int i = 0; i < m; i++) {
                System.out.println();
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix180[i][j] + " ");
                }
            }
        } else {
            System.out.println("In other case print illegal choice");
        }

    }
}
