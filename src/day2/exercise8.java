package day2;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 2;
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
