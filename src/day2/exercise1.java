package day2;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0){
                System.out.println(i + " ");
            }
        }
    }
}
