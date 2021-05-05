package day3;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = 0;
        if (num % 2 == 0) {
            for (int i = 1; i < num; i += 2) {
                    k = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = k;
            }
        } else {
            for (int i = 1; i < num - 1; i += 2) {
                k = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = k;
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
