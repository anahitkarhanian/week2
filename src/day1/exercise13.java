package day1;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double sum = num1;
        int day = 1;
        while (sum <= num2){
            sum = sum + sum * 10/100;
            day++;
        }
        System.out.println(day);

    }
}
