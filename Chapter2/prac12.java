package Chapter2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class prac12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산 >> ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);

        int num1 = Integer.parseInt(st.nextToken());
        char op = st.nextToken().charAt(0);
        int num2 = Integer.parseInt(st.nextToken());

        if (op == '/' && num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return;
        }
        System.out.println(num1 + "" + op + "" + num2 + "의 계산 결과는 " + operation(num1, op, num2));
    }

    public static int operation(int num1, char op, int num2) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
        }
        return 0;
    }
}
