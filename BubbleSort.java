package SortingAlgorithm;

public class BubbleSort {

    public void PrintArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.err.print(arr[i] + "  ");
        }
        System.err.println();
    }

    public void sort(int[] arr) {
        int n = arr.length;
        boolean isSwapped;

        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 9, 4, 10 };

        BubbleSort bs = new BubbleSort();
        // Before sorting the array
        bs.PrintArray(arr);
        // After sorting the array
        bs.sort(arr);
        bs.PrintArray(arr);
    }
}
