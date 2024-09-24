public class FindMissingNumber {

    public static int FindMissingNo(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }

    public void ArrayDemo() {
        int[] arr = { 1, 2, 6, 7, 3, 4 };
        System.out.println(FindMissingNo(arr));
    }

    public static void main(String[] args) {
        FindMissingNumber fn = new FindMissingNumber();
        fn.ArrayDemo();
    }
}
