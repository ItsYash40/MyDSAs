import java.util.*;

public class jPracticeSet2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        boolean isHappy = isHappyNumber(number);

        if (isHappy) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }

        scanner.close();
    }

    private static boolean isHappyNumber(int number) {
        Set<Integer> seenNumbers = new HashSet<>();
        while (number != 1 && !seenNumbers.contains(number)) {
            seenNumbers.add(number);
            number = getSumOfSquares(number);
        }
        return number == 1;
    }
    private static int getSumOfSquares(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
	}

}
