import java.util.*;

public class JPracticeset_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            arr[i] = scanner.nextInt();
	        }

	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            sum += arr[i];
	        }

	        System.out.println("The sum of the elements in the array is: " + sum);

	        scanner.close();
	}

}
