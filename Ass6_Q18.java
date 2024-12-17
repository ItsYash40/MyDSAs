import java.util.Scanner;
import java.util.Arrays;

public class Ass6_Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();

        Arrays.sort(array);

        int kthSmallest = array[k - 1];
        int kthLargest = array[size - k];

        System.out.println("The " + k + "-th smallest element in the array is: " + kthSmallest);
        System.out.println("The " + k + "-th largest element in the array is: " + kthLargest);

        scanner.close();
	}
}
