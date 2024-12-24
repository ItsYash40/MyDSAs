import java.util.*;
public class jPracticeSet2Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int sumOfDivisors = 0;
	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                sumOfDivisors += i;
	            }
	        }

	        if (sumOfDivisors == number) {
	            System.out.println(number + " is a perfect number.");
	        } else {
	            System.out.println(number + " is not a perfect number.");
	        }

	        scanner.close();
	}

}
