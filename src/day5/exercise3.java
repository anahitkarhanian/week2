package day5;

public class exercise3 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 2; i <= 15; i ++){
            count1++;
        }
        for (int i = 10; i <= 100; i = i+7){
            count2++;
        }
        for (float i = 1.5f; i <= 10.3; i = i+0.4f){
            count3++;
        }
            System.out.println(count1 + " " + count2 + " " + count3);
    }
}
