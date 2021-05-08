package day4;

import java.util.Random;

public class diagram {
    public static void main(String[] args) {
        int[][] matrix = new int[10][15];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(11) + 89;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j >= matrix[i].length - 1){
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}
