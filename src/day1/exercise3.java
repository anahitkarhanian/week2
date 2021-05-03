package day1;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        if (num >=1){
            System.out.println(i);
        }
        while (i <= num){
            int j = 1;
            while (j <= i /2) {
                if (i == j * j) {
                    System.out.println(i);
                    break;
                }
                j++;
            }
            i++;
        }
    }
}
