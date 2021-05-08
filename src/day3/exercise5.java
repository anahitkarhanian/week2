package day3;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < num; i++) {
            if (arr[i] >= 0 && arr[i-1] >= 0 || arr[i] < 0 && arr[i-1] < 0 ){
                System.out.println(arr[i - 1] + " " + arr[i]);
                break;
            }

        }
    }
}
