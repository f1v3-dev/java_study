package Chapter3;

import java.util.Scanner;

public class prac7 {
    public static void main(String[] args) {

        int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.print("랜덤한 정수들 : ");

        double sum = 0;
        for (int i : arr) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("평균은 " + sum / 10);



    }
}
