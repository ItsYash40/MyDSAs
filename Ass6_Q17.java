import java.util.Scanner;

public class Ass6_Q17 {

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
	        int min = array[0];
	        int max = array[0];

	        for (int i = 1; i < size; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        System.out.println("The minimum element in the array is: " + min);
	        System.out.println("The maximum element in the array is: " + max);
	        scanner.close();

	}

}
