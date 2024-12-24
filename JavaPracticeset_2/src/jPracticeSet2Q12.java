import java.util.*;

public class jPracticeSet2Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a number:");
	        int number = scanner.nextInt();

	        int count = countFactors(number);

	        System.out.println("The number of factors of " + number + " is: " + count);

	        scanner.close();
	    }
	    private static int countFactors(int number) {
	        int count = 0;
	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) {
	                count++;
	            }
	        }
	        return count;

	}

}
