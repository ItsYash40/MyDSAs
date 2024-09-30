package SortingAlgorithm;

public class SelectionSort {

    public void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
        System.err.println();
    }

    public void Sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 5, 1, 10, 2, 9 };

        SelectionSort ss = new SelectionSort();
        ss.PrintArray(arr); // Before Sorting

        ss.Sort(arr); // After Sorting
        ss.PrintArray(arr);
    }
}
