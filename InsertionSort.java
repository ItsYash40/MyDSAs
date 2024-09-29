package SortingAlgorithm;

public class InsertionSort {

    public void PrintArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.err.print(arr[i] + " ");
        }
        System.err.println();
    }

    public void Sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 9, 2, 10 };

        InsertionSort is = new InsertionSort();
        is.PrintArray(arr);

        is.Sort(arr); // After Sorting
        is.PrintArray(arr);
    }
}
