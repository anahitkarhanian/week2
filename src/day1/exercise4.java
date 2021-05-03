package day1;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 2;
        while (i <= num/2){
            if (num % i == 0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
