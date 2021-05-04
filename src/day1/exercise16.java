package day1;

import java.util.Random;
import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        //System.out.println(num);
        while (true){
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input < num){
                System.out.println("Too low, try again");
            } else if (input > num){
                System.out.println("Too high, try again");
            } else {
                System.out.println("Yes, you guessed the number");
                break;
            }
        }

    }
}
