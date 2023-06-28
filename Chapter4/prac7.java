package Chapter4;

import java.util.Scanner;


class Day {
    private String work;
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if (work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}
public class prac7 {

    Scanner sc = new Scanner(System.in);

    private Day [] day = null;
    prac7(int days) {
        day = new Day[days];
        for (int i = 0; i < days; i++) {
            day[i] = new Day();
        }
    }


    public void input() {
        System.out.print("날짜(1~30)? ");
        int num = sc.nextInt();
        System.out.print("할일(빈칸없이 입력)? ");
        String work = sc.next();
        day[num].set(work);
    }

    public void view() {
        System.out.print("날짜(1~30)? ");
        int num = sc.nextInt();
        System.out.print(num + "일의 할 일은 ");
        day[num].show();
    }

    public void finish() {
        System.out.println("프로그램을 종료합니다.");
    }

    public void run() {

        System.out.println("이번달 스케쥴 관리 프로그램.");

        while (true) {
            System.out.print("할 일(입력 : 1, 보기 : 2, 끝내기 : 3) >> ");

            int input = sc.nextInt();

            switch (input) {
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    finish();
                    return;
                default:
                    System.out.println("1, 2, 3 중에서 입력해주세요");
                    break;
            }
        }

    }
    public static void main(String[] args) {
        prac7 april = new prac7(30);
        april.run();

    }
}
