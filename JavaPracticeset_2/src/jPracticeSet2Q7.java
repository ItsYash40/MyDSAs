import java.util.*;

public class jPracticeSet2Q7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            int digits = String.valueOf(num).length();
            int sum = 0;
            int temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
        scanner.close();
	}
}
