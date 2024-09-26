public class LinearSearch {

    public int Search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 9, 2, 10, 15, 20 };

        LinearSearch ls = new LinearSearch();
        System.err.println(ls.Search(arr, arr.length, 10));
    }

}
