package day1;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true){
            int i = 1;
            boolean isEven = false;
            int num = scanner.nextInt();
            while ( i <= num){
                if (i == num){
                    isEven = true;
                    break;
                }
                i *= 2;
            }
            if ( isEven == true){
                System.out.println(count);
                break;
            } else if (isEven == false) {
                count++;
            }
        }

    }
}
