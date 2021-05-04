package day2;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int countZero = 0;
        int countNeg = 0;
        int countPos = 0;
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            if (num == 0){
                countZero++;
            } else if (num > 0){
                countPos++;
            } else {
                countNeg++;
            }
        }
        System.out.println(countZero + " " + countPos + " " + countNeg);
    }
}
