import java.util.*;

public class JPracticeset_Q7 {

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

	        HashSet<Integer> seen = new HashSet<>();
	        HashSet<Integer> duplicates = new HashSet<>();

	        for (int num : numbers) {
	            if (!seen.add(num)) {
	                duplicates.add(num);
	            }
	        }

	        if (duplicates.isEmpty()) {
	            System.out.println("No duplicate elements found.");
	        } else {
	            System.out.println("\nDuplicate elements in the array:");
	            for (int duplicate : duplicates) {
	                System.out.println(duplicate);
	            }
	        }

	        scanner.close();
	}

}
