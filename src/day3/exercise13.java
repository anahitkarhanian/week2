package day3;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int indexMax = 0;
        int indexMin = 0;
        int k = 0;
        for (int i = 1; i < num ; i++) {
            if (arr[i] > max){
                max = arr[i];
                indexMax = i;
            }
            if(arr[i] < min){
                min = arr[i];
                indexMin = i;
            }
        }
        k = arr[indexMax];
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = k;
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
