package day1;

public class exercise10 {
    public static void main(String[] args) {
        int num = 32;
        int count = 0;
        while (num <= 122){
            char ch = (char) num;
            System.out.print(ch + " ");
            count++;
            if (count == 10){
                count = 0;
                System.out.println();
            }
            num++;
        }
    }
}
