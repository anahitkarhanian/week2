package day1;

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = num;
        int num2 = num;
        while (num != 0){
            num = scanner.nextInt();
            if (num > num1){
                num2 = num1;
                num1 = num;
            } else if (num < num1) {
                if (num > num2 || (num1 == num2 && num < num2 && num != 0)){
                    num2 = num;
                }
            }
        }
        System.out.println(num2);
    }

}
