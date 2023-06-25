package Chapter2;

import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ");

        int won = sc.nextInt();
        double dollar = won / 1100;

        System.out.print(won + "원은 $" + dollar + "입니다.");

    }
}
