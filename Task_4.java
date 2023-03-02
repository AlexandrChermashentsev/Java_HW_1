package Seminar_1_HW;

import java.util.Arrays;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(100);
        }

        // // int[] mas = {7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 5};
        int min = mas[0], max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] < min){
                min = mas[i];
            }
            if(mas[i] > max){
                max = mas[i];
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("max = "+max+" min = "+min);
    }
}
