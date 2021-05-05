package day3;

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        int count1 = 0;

        for (int i = 0; i < num; i++) {
            int count = 0;
            for (int j = 0; j < num; j++) {
                if (arr[i] == arr[j] && i != j){
                    count++;
                }
            }
            if (count == 0){
                count1++;
            }
        }
        System.out.println(count1++);

    }
}
