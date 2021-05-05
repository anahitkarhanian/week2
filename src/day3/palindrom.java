package day3;

import java.util.Scanner;

public class palindrom {
    public static boolean P(String text){
        int length = text.length();
        StringBuilder text1 = new StringBuilder(text);
        StringBuilder stringBuilder = new StringBuilder(text1.reverse());
        if(text1.toString().equals(text.toString())){
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int length = text.length();
        int index = length - 1;
        for (int i = length - 1; i > 0; i--) {
            String text1 = text.substring(i-1);
            if (P(text1)){
                index = i - 1;
                break;
            }
        }
        String text2 = text.substring(0, index);
        StringBuilder text3 = new StringBuilder(text2);
        StringBuilder text4 = new StringBuilder(text3.reverse());
        text += text4;
        System.out.println(text);
    }

}
