import java.util.*;
public class jPracticeSet2Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the value of n:");
	        int n = scanner.nextInt();

	        int sumEven = 0;
	        int sumOdd = 0;

	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                sumEven += i;
	            } else {
	                sumOdd += i;
	            }
	        }

	        System.out.println("The sum of all even numbers between 1 and " + n + " is: " + sumEven);
	        System.out.println("The sum of all odd numbers between 1 and " + n + " is: " + sumOdd);

	        scanner.close();
		
		
	}

}
