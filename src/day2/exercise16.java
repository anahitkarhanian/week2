package day2;

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i ; j--) {

                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= num; i++) {
            for (int j = 1 ; j <= num ; j++) {
                if (j < i){
                    System.out.print("  ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= num; i++) {
            for (int j = 1 ; j <= num - i ; j++) {
                System.out.print("  ");
            }
            for (int j = num - i + 1 ; j <= num ; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }



    }
}
