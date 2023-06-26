package Chapter3;

import java.util.Scanner;

public class prac8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 몇 개 ? ");
        int num = sc.nextInt();

        int [] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int)(Math.random() * 100 + 1);
        }

        int count = 0;
        for (int i : arr) {
            if (count % 10 == 0 && count != 0) {
                System.out.println();
            }
            System.out.print(i + " ");
            count++;
        }
    }
}
