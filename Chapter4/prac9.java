package Chapter4;

class ArrayUtil {

    public static int [] concat(int[] a, int[] b) {
        int length = a.length + b.length;
        int [] arr = new int[length];

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (i < a.length) {
                arr[i] = a[i];
            }else {
                arr[i] = b[count++];
            }
        }
        return arr;
    }

    public static void print(int[] a) {

        System.out.print("[ ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.print("]");
    }
}
public class prac9 {
    public static void main(String[] args) {
        int [] array1 = {1, 5, 7, 9};
        int [] array2 = {3, 6, -1, 100, 77};
        int [] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
