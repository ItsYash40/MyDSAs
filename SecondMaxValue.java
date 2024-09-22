package Array;

public class SecondMaxValue {

    public int FindSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                SecondMax = max;
                max = arr[i];
            } else if (arr[i] > SecondMax && arr[i] != max) {
                SecondMax = arr[i];
            }
        }
        return SecondMax;
    }

    public static void main(String[] args) {
        int[] arr = { 13, 34, 2, 34, 33, 1 };

        SecondMaxValue smv = new SecondMaxValue();
        System.err.println(smv.FindSecondMax(arr));
    }

}
