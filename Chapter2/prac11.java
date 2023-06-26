package Chapter2;

import java.util.Scanner;

public class prac11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("달을 입력하세요(1 ~ 12) >> ");
        int month = sc.nextInt();

        System.out.println(season(month));

    }

    public static String season(int month) {
        if (3 <= month && month <= 5) {
            return "봄";
        } else if (6 <= month && month <= 8) {
            return "여름";
        } else if (9 <= month && month <= 11) {
            return "가을";
        } else if (month == 12 || ( month > 0  && month <= 2)) {
            return "겨울";
        } else {
            return "잘못입력";
        }
    }
}
