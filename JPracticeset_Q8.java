import java.util.Scanner;

public class JPracticeset_Q8 {

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

	        boolean[] counted = new boolean[n];

	        System.out.println("Frequency of each element:");
	        for (int i = 0; i < n; i++) {

	            if (counted[i]) {
	                continue;
	            }

	            int count = 1;

	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    counted[j] = true;
	                }
	            }

	            System.out.println("Element " + arr[i] + " occurs " + count + " time(s).");
	            counted[i] = true;
	        }

	        scanner.close();
	}

}
