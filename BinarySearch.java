public class BinarySearch {

    public int binarySearch(int[] nums, int key) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (nums[mid] == key) {
                return mid;
            }
            if (key < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 21, 32, 43, 54, 65, 76, 87, 98 };

        BinarySearch bs = new BinarySearch();
        System.err.println(bs.binarySearch(nums, 54));
    }

}
