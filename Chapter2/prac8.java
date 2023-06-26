package Chapter2;

import java.util.Scanner;

public class prac8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점 (x1, y1)의 좌표를 입력하시오 >> ");
        int rectx1 = sc.nextInt();
        int recty1 = sc.nextInt();

        System.out.print("점 (x2, y2)의 좌표를 입력하시오 >> ");
        int rectx2 = sc.nextInt();
        int recty2 = sc.nextInt();

        System.out.print("점 (x, y)의 좌표를 입력하시오 >> ");
        int x = sc.nextInt();
        int y = sc.nextInt();


        if (inRect(x, y, rectx1, recty1, rectx2, recty2)) {
            System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");
        } else {
            System.out.println("(" + x + "," + y + ")는 사각형 안에 없습니다.");
        }
    }

    public static boolean inRect(int x, int y, int rectx1, int recty1,
                                 int rectx2, int recty2) {
        if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
            return true;
        else return false;
    }
}
