package day5;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOneInt = scanner.nextInt();
        int numTwoInt = scanner.nextInt();
        for (int i = numOneInt; i <= numTwoInt ; i++) {
            String numSt = Integer.toString(i);
            String numStRevers = (new StringBuilder(numSt)).reverse().toString();
            if (numSt.equals(numStRevers)){
                System.out.println(i);
            }
        }
    }
}
