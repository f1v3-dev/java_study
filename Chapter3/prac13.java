package Chapter3;

public class prac13 {
    public static void main(String[] args) {
        int num = 100;

        for (int i = 1; i < num; i++){
            int count = 0;
            int unit = i % 10;
            int ten = i / 10;

            if (unit % 3 == 0 && unit != 0) {
                count++;
            }

            if (ten % 3 == 0 && ten != 0) {
                count++;
            }

            if (count == 1) {
                System.out.println(i + " 박수 짝");
            } else if (count == 2) {
                System.out.println(i + " 박수 짝짝");
            }

        }
    }
}
