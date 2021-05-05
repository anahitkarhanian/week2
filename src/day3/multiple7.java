package day3;

public class multiple7 {
    public static void main(String[] args) {
        int[] number = new int[1000];
        for (int i = 0, k = 7; i < 1000; i++, k += 7) {
            number[i] = k;
        }
        for (int i = 0; i < 1000; i++) {
            System.out.print(number[i] + " ");
        }

    }
}
