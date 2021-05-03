package day1;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 1;
        int x = 1;
        int y = 1;
        while (true){
            if (num == 1){
                System.out.println("0");
                break;
            }
            int z = x + y;
            x = y;
            y = z;
            if (x == num){
                System.out.println(count);
                break;
            } else if (x > num){
                System.out.println("-1");
                break;
            } else {
                count++;
            }
        }
    }
}
