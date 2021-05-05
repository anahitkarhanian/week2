package day3;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < num; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max + " " + index);
    }
}
