package day3;

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int [num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean check1 = true;
        boolean check2 = true;
        for (int i = 0; i < num - 1; i++) {
            if (!(arr[i] < arr[i+1])){
                check1 = false;
                break;
            }
        }
        if (check1 == false){
            for (int i = 0; i < num - 1; i++) {
                if (!(arr[i] > arr[i + 1])) {
                    check2 = false;
                    break;
                }
            }
        }
        if (check1 == true || check2 == true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}
