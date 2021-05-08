package day4;

import java.util.Random;

public class cub {
    public static void main(String[] args) {
        int[][][] matrix = new int[10][10][10];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    matrix[i][j][k] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
                for (int k = 0; k < matrix[i][0].length; k++){
                    if ( i + k >= matrix[i][0].length - 1){
                        sum += matrix[i][0][k];
                    }
            }
        }
        System.out.println(sum);
    }
}
