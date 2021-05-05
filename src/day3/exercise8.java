package day3;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 1;
        for (int i = 1; i < num; i++) {
            if (arr[i] > arr[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
