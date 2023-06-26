package Chapter3;

import java.util.Scanner;

public class prac6 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류


        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오 >> ");
        int num = sc.nextInt();

        for (int n : unit) {
            int result = num / n;
            if (result == 0) continue;
            System.out.println(n + "원 짜리 : " + result + "개");
            num %= n;
        }
    }
}
