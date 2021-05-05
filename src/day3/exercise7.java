package day3;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = 1000;
        for (int i = 0; i < num; i++) {
            if (arr[i] >= 0 && arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
