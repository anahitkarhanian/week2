package day5;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0){
                int count = 0;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            count++;
                            break;
                        }
                    }
                    if(count > 0){
                        continue;
                    } else {
                        while(num % i == 0){
                            System.out.print(i + " ");
                            num = num/i;
                        }
                    }
            }
        }
    }
}
