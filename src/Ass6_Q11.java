import java.util.Scanner;
public class Ass6_Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a double number as a string: ");
	        String input = scanner.nextLine(); 
	        
	        try {
	            double number = Double.parseDouble(input);
	            System.out.println("The double value is: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input. Please enter a valid double number.");
	        } finally {
	            scanner.close();
	        }
	}
}
