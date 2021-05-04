package day2;

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.next();
        int length = pass.length();
        int letter = 0;
        int upLetter = 0;
        int num = 0;
        int symb = 0;
        for (int i = 0; i < length; i++) {
                if (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z'){
                    letter++;
                } else if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z'){
                    upLetter++;
                } else if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                    num++;
                } else if (pass.charAt(i) == '$' || pass.charAt(i) == '#' || pass.charAt(i) == '@'){
                    symb++;
                }
        }
        if (!(length >= 6 && length <= 16) || letter == 0 || upLetter == 0 || num == 0) {
            System.out.println("invalid");
        } else {
            System.out.println("valid");
        }
    }
}
