package day3;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr1 = new int [num];
        int[] arr2 = new int [num];
        for (int i = 0; i < num; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = num - 1; i >= 0 ; i--) {
            arr2[num - i - 1] = arr1[i];
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
