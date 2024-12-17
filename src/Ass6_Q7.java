import java.util.Scanner;
public class Ass6_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Take a Double number: ");
		String n= sc.nextLine();
		try {
            Double i = Double.valueOf(n);
            System.out.println("The Double object is: " + i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid Double value.");
        } 
	}
}
