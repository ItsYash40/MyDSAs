import java.util.*;
public class IntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Take a integer number: ");
		String n= sc.nextLine();
		
		try {
            Integer i = Integer.valueOf(n);
            
            System.out.println("The Integer object is: " + i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } 

	}

}
