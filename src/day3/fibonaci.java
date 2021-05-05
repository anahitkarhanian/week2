package day3;

public class fibonaci {
    public static void main(String[] args) {
        int[] fib = new int[10];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < 10; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(fib[i]);
        }

    }
}
