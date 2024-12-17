import java.util.Scanner;
public class Ass6_Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer number as a string: ");
	        String input = scanner.nextLine();  
	        try {
	            int number = Integer.parseInt(input);
	            System.out.println("The integer value is: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input. Please enter a valid integer number.");
	        } finally {
	            scanner.close();
	        }
	}
}
