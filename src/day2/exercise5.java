package day2;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int revX = 0;
        for (int i = x; i > 0 ; i = i / 10) {
            int rem = 0;
             rem = i % 10;
             revX = revX * 10 + rem;
        }
        System.out.println(revX);
    }
}
