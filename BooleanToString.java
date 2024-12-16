import java.util.Scanner;

public class BooleanToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Take a Boolean Value ");
		String n= sc.nextLine();
		
		try {
			Boolean i = Boolean.valueOf(n);
            
            System.out.println("The Boolean object is: " + i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid Boolean value.");
        } 

	}

}
