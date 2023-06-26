package Chapter2;

import java.util.Scanner;

public class prac10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 원의 중심과 반지름 입력 >> ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        double r1 = sc.nextDouble();

        System.out.print("두 번째 원의 중심과 반지름 입력 >> ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double r2 = sc.nextDouble();

        if (isCross(x1, y1, r1, x2, y2, r2)) {
            System.out.println("두 원은 서로 겹친다.");
        } else {
            System.out.println("두 원은 서로 겹치지 않는다.");
        }
    }

    public static boolean isCross(int x1, int y1, double r1,
                                  int x2, int y2, double r2) {
        if ( ((x1 - r1) <= (x2 - r2)) && ((x2 - r2) <= (x1 + r1)) ||
                ( ((y1 - r1) <= (x2 - r2)) && ((y2 - r2) <= (y1 + r1))) ) {
            return true;
        } else return false;
    }
}
