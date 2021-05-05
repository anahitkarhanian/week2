package day3;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        int count = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            if (arr[i] >= 0){
                count ++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(count);
    }
}
