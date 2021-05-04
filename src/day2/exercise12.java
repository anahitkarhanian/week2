package day2;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for1:
        for (int i = 1;; i++) {
            for (int j = 1; j <=i ; j++) {
                if (count != 0){
                    count--;
                    System.out.print(i + "");
                } else {
                    break for1;
                }
            }
        }
    }
}
