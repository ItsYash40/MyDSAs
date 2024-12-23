import java.util.*;

public class JPracticeset_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the array: ");
	        int size = scanner.nextInt();

	        int[] numbers = new int[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt(); 
	        }

	        System.out.println("\nArray elements in reverse order:");
	        for (int i = size - 1; i >= 0; i--) {
	            System.out.println(numbers[i]); 
	        }

	        // Close the scanner
	        scanner.close();
	}
}