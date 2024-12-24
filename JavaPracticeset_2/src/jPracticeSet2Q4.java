import java.util.*;

public class jPracticeSet2Q4 {

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

		        int[] sumOfDigitsArray = new int[size];
		        for (int i = 0; i < size; i++) {
		            sumOfDigitsArray[i] = sumOfDigits(array[i]);
		        }

		        System.out.println("The sum of the digits of each number in the array is:");
		        for (int i = 0; i < size; i++) {
		            System.out.println("Number: " + array[i] + ", Sum of Digits: " + sumOfDigitsArray[i]);
		        }

		        scanner.close();
		    }

		    private static int sumOfDigits(int number) {
		        int sum = 0;
		        while (number > 0) {
		            sum += number % 10;
		            number /= 10;
		        }
		        return sum;

	}

}
