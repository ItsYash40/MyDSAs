import java.util.Scanner;
public class Ass6_Q16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int largest = Integer.MIN_VALUE;
	        int smallest = Integer.MAX_VALUE;
	        char choice;
	        do {
	            System.out.println("Enter a number:");
	            int number = scanner.nextInt();
	            if (number > largest) {
	                largest = number;
	            }
	            if (number < smallest) {
	                smallest = number;
	            }
	            System.out.println("Do you want to enter another number? (y/n):");
	            choice = scanner.next().charAt(0);
	        } while (choice == 'y' || choice == 'Y');
	        System.out.println("The largest number entered is: " + largest);
	        System.out.println("The smallest number entered is: " + smallest);
	        scanner.close();
	}
}
