package day3;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = 0;
        for (int i = num - 1; i > 0; i--) {
            k = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = k;
        }

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }
}
