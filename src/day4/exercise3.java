package day4;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        boolean check = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == matrix[j][i]) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
        }
        if(check == true){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
