package day1;

import java.util.Scanner;

public class foil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextInt();
        double radius = 2;
        double thick = 0.0025;
        double pi = Math.PI;
        int i = 0;
        double diametre = 2 * radius;
        while (length >= 0){
            diametre = 2 * (radius + i * thick);
            double p = 2 * pi * diametre / 2;
            length -= p;
            i++;
        }
        System.out.println((float) diametre);

    }
}
