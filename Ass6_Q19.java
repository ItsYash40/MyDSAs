import java.util.Scanner;
import java.util.Arrays;
public class Ass6_Q19 {
	
	 public static void printArray(int[] array) {
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	 
	 public static void reverseArray(int[] array) {
	        int start = 0; 
	        int end = array.length - 1;

	        while (start < end) {
	            int temp = array[start];
	            array[start] = array[end];
	            array[end] = temp;

	            start++;
	            end--;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original array:");
        printArray(array);
        
        reverseArray(array);

        System.out.println("Reversed array:");
        printArray(array);

        scanner.close();
	}

}
