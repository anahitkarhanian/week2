package day4;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < num - 1; i++) {
            if(arr[i] == arr[i + 1]){
                count++;
            } else if(count == 0){
                count1++;
                count = 0;
            }
        }
        if(arr[num-2] != arr[num-1]){
            count1++;
        }
        System.out.println(count1);
    }
}
