package Array;

public class MinArray {

    public int FindMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("invalid input");
        }
        int min = arr[0]; // min will hold the minimum of Array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 9, 15, 1, 2 };
        MinArray m = new MinArray();
        System.out.println(m.FindMinimum(arr));
    }
}