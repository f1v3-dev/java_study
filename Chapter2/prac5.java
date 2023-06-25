package Chapter2;

import java.util.Scanner;

public class prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 3개를 입력하시오 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        int x = 0, y = 0;

        // a가 가장 긴 변인 경우
        if (((a > b) && (a > c)) || ((a > c) && (a > b))) {
            max = a;
            x = b;
            y = c;
        }

        // b가 가장 긴 변인 경우
        else if (((b > a) && (b > c)) || (b > c) && (b > a)) {
            max = b;
            x = a;
            y = c;
        }

        // c가 가장 긴 변인 경우
        else if (((c > a) && (c > b)) || (c > b) && (c > a)) {
            max = c;
            x = a;
            y = b;
        }

        if ((x + y) > max) {
            System.out.println("삼각형이 됩니다.");
        }
        else {
            System.out.println("삼각형이 될 수 없습니다.");
        }

    }
}
