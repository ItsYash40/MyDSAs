import java.util.*;

public class jPracticeSet2Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;
        int originalNumber = number;
        while (number != 0) {
            int digit = number % 10;  
            reversed = reversed * 10 + digit;  
            number /= 10;  
        }
         if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
        scanner.close();
	}

}
