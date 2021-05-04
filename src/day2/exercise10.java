package day2;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int length = text.length();
        double num = 0;
        for (int i = length - 1, j = 0; i >= 0 ; i--, j++) {
            char symb = text.charAt(i);
            int digit  = Character.getNumericValue(symb);
            num += digit * Math.pow(2,j);
        }
        System.out.println(num);

    }
}
