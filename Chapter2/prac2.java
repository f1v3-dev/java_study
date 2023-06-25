package Chapter2;

import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2자리수 정수 입력(10~99)>> ");
        int number = sc.nextInt();
        if (number / 10 == number % 10) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        } else {
            System.out.println("NO. 10의 자리와 1의 자리가 다릅니다.");
        }
    }
}
