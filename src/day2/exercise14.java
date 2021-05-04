package day2;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int num = scanner.nextInt();
            if(num < 0){
                System.out.println("please input positive number");
                continue;
            } else {
                for (int i = 0; i < num; i++) {
                    for (int j = 0; j < num; j++) {
                        System.out.print("#" + " ");
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}
