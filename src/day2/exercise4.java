package day2;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int d = scanner.nextInt();
        int count = 0;
        for (int i = x; i > 0; i = i /10) {
            int j = i % 10;
            if (j == d){
                count ++;
            }
        }
        System.out.println(count);
    }
}
