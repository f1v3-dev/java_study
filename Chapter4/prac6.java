package Chapter4;

import java.util.Scanner;

class Circle2 {
    private double x, y;
    private int radius;
    public Circle2(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("가장 면적이 큰 원은 (" + x + "," + y + ")" + radius);
    }

    public int getRadius() {
        return this.radius;
    }
}
public class prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle2 c [] = new Circle2[3];

        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >> ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle2(x, y, radius);
        }

        int max = 0;

        Circle2 maxCircle = null;
        for (int i = 0; i < c.length; i++) {
            if (c[i].getRadius() > max) {
                max = c[i].getRadius();
                maxCircle = c[i];
            }
        }

        maxCircle.show();
        sc.close();
    }
}
