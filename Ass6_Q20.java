import java.util.Scanner;

public class Ass6_Q20 {

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
	        for (int i = 0; i < size - 1; i++) {
	            for (int j = 0; j < size - 1 - i; j++) {
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	        System.out.println("The sorted array is:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(array[i] + " ");
	        }
	        scanner.close();
	}
}
