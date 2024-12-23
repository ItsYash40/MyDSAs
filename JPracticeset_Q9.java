import java.util.*;

public class JPracticeset_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the first array: ");
	        int size1 = scanner.nextInt();
	        int[] array1 = new int[size1];
	        System.out.println("Enter the elements of the first array:");
	        for (int i = 0; i < size1; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array1[i] = scanner.nextInt();
	        }
	        System.out.print("Enter the number of elements in the second array: ");
	        int size2 = scanner.nextInt();
	        int[] array2 = new int[size2];
	        System.out.println("Enter the elements of the second array:");
	        for (int i = 0; i < size2; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array2[i] = scanner.nextInt();
	        }
	        int[] mergedArray = new int[size1 + size2];
	        for (int i = 0; i < size1; i++) {
	            mergedArray[i] = array1[i];
	        }
	        for (int i = 0; i < size2; i++) {
	            mergedArray[size1 + i] = array2[i];
	        }
	        System.out.println("The merged array is:");
	        for (int i = 0; i < mergedArray.length; i++) {
	            System.out.print(mergedArray[i] + " ");
	        }
	        scanner.close();
	}
}
