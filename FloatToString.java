import java.util.Scanner;

public class FloatToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("Take a Float number: ");
		String n= sc.nextLine();
		
		try {
            Float i = Float.valueOf(n);
            
            System.out.println("The Float object is: " + i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid Float value.");
        } 

	}

}
