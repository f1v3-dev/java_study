package Chapter3;

public class prac9 {
    public static void main(String[] args) {
        int [][] arr= new int[4][4];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int)(Math.random() * 10 + 1);
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
