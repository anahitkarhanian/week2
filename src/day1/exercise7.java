package day1;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num > 0){
            if (num % 2 == 0){
                System.out.print(num + " ");
            }
            num--;
        }
    }
}
