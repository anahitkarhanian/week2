package day5;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = scanner.nextDouble();
        double q = scanner.nextDouble();
        int n = scanner.nextInt();
        for (int i = 2; i <= n ; i++) {
            b1 *= q;
        }
        System.out.format("%.2f",b1);
    }
}
