package day2;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 2;
        int b = 30000;
        for (int i = a; i <= b ; i++) {
            if (num % i == 0){
                System.out.println(i);
                break;
            }

        }
    }
}
