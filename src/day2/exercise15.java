package day2;

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int num = scanner.nextInt();
            if (num < 0){
                System.out.println("please input positive number");
                continue;
            } else {
                System.out.print("*| ");
                for (int i = 1; i <= num; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                for (int i = 1; i <= num; i++) {
                    System.out.print("---");
                }
                System.out.println();
                for (int i = 1; i <= num ; i++) {
                    System.out.print(i + "| ");
                    for (int j = 1; j <= num; j++) {
                        System.out.print(i * j + " ");
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}
