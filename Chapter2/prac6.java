package Chapter2;

import java.util.Scanner;

public class prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1 ~ 99 사이의 정수를 입력하시오 >> ");
        int num = sc.nextInt();

        int unit = num % 10;
        int ten = num / 10;
        int count = 0;
        if (unit % 3 == 0) {
            count++;
        }
        if (ten % 3 == 0) {
            count++;
        }

        if (count == 1) {
            System.out.println("박수짝");
        }
        else if (count == 2) {
            System.out.println("박수짝짝");
        }

    }
}
