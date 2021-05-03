package day1;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        while (i <= num){
            System.out.println(i);
            i *= 2;
        }
    }
}
