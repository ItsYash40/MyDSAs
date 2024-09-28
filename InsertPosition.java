public class InsertPosition {

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int SearchInsert(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid - 1;
            }

        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 21, 32, 43, 54, 36, 68, 9 };
        PrintArray(arr);
        InsertPosition ip = new InsertPosition();
        System.err.println(ip.SearchInsert(arr, 54));

    }

}
