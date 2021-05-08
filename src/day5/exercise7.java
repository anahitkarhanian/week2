package day5;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.println();
            for (int j = 1; j <= n ; j++) {
                if(i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("o" + " ");
                    } else {
                        System.out.print("x" + " ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print("x" + " ");
                    } else {
                        System.out.print("o" + " ");
                    }
                }
            }
        }
    }
}
