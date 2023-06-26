package Chapter2;

import java.util.Scanner;

public class prac9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력 >> ");

        int rectx = sc.nextInt();
        int recty = sc.nextInt();
        double r = sc.nextDouble();

        System.out.print("점 입력 >> ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(inRect(rectx, recty, r, x, y)) {
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다." );
        }
        else {
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 없다." );
        }

    }

    public static boolean inRect(int rectx, int recty, double r, double x, double y) {
        
        if ((rectx + r) >= x && (recty + r) >= y) {
            return true;
        }
        else return false;
        
    }
}
