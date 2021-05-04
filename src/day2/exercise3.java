package day2;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            for (int j = 0; j <= i; j++) {
                if(i == j * j){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
