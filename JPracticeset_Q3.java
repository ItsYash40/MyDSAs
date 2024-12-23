import java.util.*;

public class JPracticeset_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Read each element from user input
        }

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; 
            }
            if (numbers[i] > largest) {
                largest = numbers[i]; 
            }
        }

        System.out.println("\nSmallest element in the array: " + smallest);
        System.out.println("Largest element in the array: " + largest);

        scanner.close();
	}

}
