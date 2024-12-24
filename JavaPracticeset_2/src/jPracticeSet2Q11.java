import java.util.*;
public class jPracticeSet2Q11 {

	public static void main(String[] args) {
		 // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int sum = calculateSumOfDigits(number);

        System.out.println("The sum of the digits of " + number + " is: " + sum);

        scanner.close();
    }

    private static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
	}
}
