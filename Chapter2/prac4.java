package Chapter2;

import java.util.Scanner;

public class prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mid = 0;

        // a가 중간 값인 경우
        if ((a > b) && (a < c)) {
            mid = a;
        }
        else if ((a > c) && (a < b)) {
            mid = a;
        }

        // b가 중간 값인 경우
        else if ((b > a) && (b < c)) {
            mid = b;
        }
        else if ((b > c) && (b < a)) {
            mid = b;
        }

        // c가 중간 값인 경우
        else if ((c > a) && (c < b)) {
            mid = c;
        }
        else if ((c > b) && (c < a)) {
            mid = c;
        }

        System.out.println("중간 값은 " + mid);
    }
}
