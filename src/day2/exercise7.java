package day2;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num / 2; i++) {
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
}
