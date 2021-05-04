package day2;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
