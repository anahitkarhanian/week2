package day1;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deposit = scanner.nextInt();
        int percent = scanner.nextInt();
        int contribution = scanner.nextInt();
        double sum = deposit;
        int year = 0;
        while (sum <= contribution){
            sum += (double) deposit * percent /100;
            deposit = (int) sum;
            year++;
        }
        System.out.println(year);
    }
}
