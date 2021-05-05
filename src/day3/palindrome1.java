package day3;

import java.util.Scanner;

public class palindrome1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String textPalLeft = palindromeLeft(text);
        String textPalRight = palindromeRight(text);
        if (textPalLeft.length() < textPalRight.length()){
            System.out.println(textPalLeft);
        } else if (textPalLeft.length() > textPalRight.length()){
            System.out.println(textPalRight);
        } else {
            System.out.print(textPalRight + " " + textPalLeft);
        }
    }

    public static String palindromeRight(String text){
        for (int i = 0; i < text.length(); i++) {
            String temp = text.substring(i);
            if (isPalindrome(temp)) {
                String reversText = (new StringBuilder(text.substring(0, i))).reverse().toString();
                text += reversText;
                break;
            }
        }
        return text;
    }

    public static String palindromeLeft(String text){
        for (int i = text.length() - 1; i >= 0; i--) {
            String temp = text.substring(0,i+1);
            if (isPalindrome(temp)) {
                String reversText = (new StringBuilder(text.substring(i+1))).reverse().toString();
                reversText += text;
                text = reversText;
                break;
            }
        }
        return text;
    }

    public static boolean isPalindrome(String text){
        String reversText = (new StringBuilder(text)).reverse().toString();
        if(reversText.equals(text)){
            return true;
        } else return false;
    }
}
