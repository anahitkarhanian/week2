package day4;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        while (top <= n / 2) {
            for (int j = left; j <= right; j++) {
                matrix[top][j] = 1;
            }
            if (left == 0 ){
                left += 1;
            } else {
                left += 2;
            }
            top += 2;
            right -= 2;
        }
        left = 0;
        right = n - 1;
        top = 0;
        bottom = n - 1;
        while (top <= n / 2) {
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = 1;
            }
            for (int j = right; j >= left; j--) {
                matrix[bottom][j] = 1;
            }
            top += 2;
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = 1;
            }
            left +=2;
            right -= 2;
            bottom -= 2;
        }
        if(n % 2 == 0){
            matrix[n/2][n/2-1] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

    }
}
