package Array;

public class RemoveEvenInteger {

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static int[] removeEven(int[] arr) {
        int OddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                OddCount++;
            }
        }

        int[] result = new int[OddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 5, 6 };
        PrintArray(arr); // For printing the main array

        int[] result = removeEven(arr); // For printing the Remove elements
        PrintArray(result);

    }

}
