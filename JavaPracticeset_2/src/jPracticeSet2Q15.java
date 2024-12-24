import java.util.*;

public class jPracticeSet2Q15 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();
	        System.out.println("Numbers between 1 and " + n + " that are divisible by both 3 and 5:");
	        for (int i = 1; i <= n; i++) {
	            if (i % 15 == 0) {
	                System.out.println(i);
	            }
	        }
	        scanner.close();
	}

}
