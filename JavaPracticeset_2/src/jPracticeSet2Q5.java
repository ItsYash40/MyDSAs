import java.util.*;

public class jPracticeSet2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        boolean isAutomorphic = isAutomorphicNumber(number);

        if (isAutomorphic) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        scanner.close();
    }

    private static boolean isAutomorphicNumber(int number) {
        int squaredNumber = number * number;
        String numberStr = String.valueOf(number);
        String squaredNumberStr = String.valueOf(squaredNumber);

        return squaredNumberStr.endsWith(numberStr);

	}

}
