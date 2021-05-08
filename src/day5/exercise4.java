package day5;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        if (num <= 0 || num == 1 || num == 2){
            System.out.println("is not prime");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 0){
                System.out.println("is prime");
            } else {
                System.out.println("is not prime");
            }
        }
    }
}
