package Chapter3;

public class prac10 {
    public static void main(String[] args) {
        int [][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int)(Math.random() * 10 + 1);
            }
        }

        int count = 6;
        while (count > 0) {
            int x = (int)(Math.random() * 3);
            int y = (int)(Math.random() * 3);

            if (arr[x][y] != 0) {
                arr[x][y] = 0;
                count--;
            }
        }

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
