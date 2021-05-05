package day3;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        for (int i = k; i < num - 1; i++) {
            arr[i] = arr[i+1];
        }
        for (int i = 0; i < num - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
