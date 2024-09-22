package Array;

public class MoveZeros {

    public void PrintArray(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void ArrayDemo() {

        int[] arr = { 8, 1, 0, 2, 4, 0, 3 };
        PrintArray(arr);
        moveZero(arr, arr.length);
        PrintArray(arr);
    }

    public void moveZero(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }

        }
    }

    public static void main(String[] args) {
        MoveZeros z = new MoveZeros();
        z.ArrayDemo();

    }

}
