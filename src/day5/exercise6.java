package day5;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char first = word.charAt(0);
        char two = word.charAt(1);
        char third = word.charAt(2);
        if(first >= 'a' && first <= 'z'){
            first -= 32;
        }
        if(two >= 'A' && two <= 'Z'){
            two += 32;
        }
        if(third >= 'A' && third <= 'Z'){
            third += 32;
        }
        String trueSt = Character.toString(first) + Character.toString(two) +Character.toString(third);
        System.out.println(trueSt);

    }
}
