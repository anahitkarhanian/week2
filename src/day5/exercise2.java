package day5;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        int day = minutes/(24 * 60);
        int hour = minutes % (24 * 60) / 60;
        int minuteS = minutes % (24 * 60) % 60;
        System.out.println(day + " " + hour + " " + minuteS);
    }
}
