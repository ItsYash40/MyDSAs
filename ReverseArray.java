public class ReverseArray {

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Reverse(int[] nums, int Start, int End) {
        while (Start < End) {
            int temp = nums[Start];
            nums[Start] = nums[End];
            nums[End] = temp;
            Start++;
            End--;

        }
    }

    public static void main(String[] args) {
        // ReverseArray r = new ReverseArray();
        int[] nums = { 2, 4, 5, 6, 8, 9 };
        PrintArray(nums);

        Reverse(nums, 0, nums.length - 1);
        PrintArray(nums);
    }

}
