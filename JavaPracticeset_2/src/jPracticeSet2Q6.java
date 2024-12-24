import java.util.*;

public class jPracticeSet2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the starting number: ");
	        int start = scanner.nextInt();
	        System.out.print("Enter the ending number: ");
	        int end = scanner.nextInt();
	        System.out.println("Perfect square numbers between " + start + " and " + end + " are:");
	        boolean found = false;
	        for (int i = 0; i * i <= end; i++) {
	            int perfectSquare = i * i;
	            if (perfectSquare >= start && perfectSquare <= end) {
	                System.out.print(perfectSquare + " ");
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("There are no perfect square numbers between " + start + " and " + end + ".");
	        }

	}

}
