package Chapter4;


import java.util.Scanner;

class Phone {
    private String name;
    private String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return this.name;
    }

    public String getTel() {
        return this.tel;
    }
}
public class prac8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수 >> ");
        int num = sc.nextInt();
        Phone [] phones = new Phone[num];

        for (int i = 0; i < num; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
            String name = sc.next();
            String tel = sc.next();
            phones[i] = new Phone(name, tel);
        }

        System.out.println("저장되었습니다...");

        while (true) {
            boolean op = false;
            System.out.print("검색할 이름 >> ");
            String name = sc.next();

            if (name.equals("그만")){
                break;
            }

            for (int i = 0; i < num; i++) {
                if (name.equals(phones[i].getName())) {
                    System.out.println(name +"의 번호는 " + phones[i].getTel() + " 입니다.");
                    op = true;
                }
            }
            if (op == false) {
                System.out.println(name + "이 없습니다.");
            }

        }
    }
}
