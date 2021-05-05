package day3;

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i < num; i++) {
            if (arr[i] == 0){
                count++;
            } else if (count != 0){
                arr[i - count] = arr[i];
                arr[i] = 0;
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
