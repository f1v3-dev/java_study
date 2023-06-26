package Chapter3;

import java.util.Scanner;

public class prac14 {
    public static void main(String[] args) {
        String [] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int [] score = {95, 88, 76, 62, 55};

        Scanner sc = new Scanner(System.in);

        String name = "";

        while (!name.equals("그만")) {
            System.out.print("과목이름 >> ");
            name = sc.next();

            int n = 0;
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(name))
                    n = score[i];
            }
            if (name.equals("그만")) n = -1;

            if (n > 0) {
                System.out.println(name + "의 점수는 " + n);
            } else if (n == 0) {
                System.out.println("없는 과목입니다.");
            }
        }
    }
}
