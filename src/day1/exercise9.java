package day1;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        int n = 0;
        while (i < num ){
            i *= 2;
            n++;
        }
        System.out.println(n);

    }
}
