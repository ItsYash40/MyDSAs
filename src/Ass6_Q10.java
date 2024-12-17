import java.util.Scanner;
public class Ass6_Q10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter input (e.g., 123+345): ");
		 String input = sc.nextLine();

		 char operator = input.replaceAll("[0-9]", "").charAt(0);
		 String[] parts = input.split("[+\\-*/]");

		 int num1 = Integer.parseInt(parts[0]);
		 int num2 = Integer.parseInt(parts[1]);
		 int result = switch (operator) {
		 case '+' -> num1 + num2;
		 case '-' -> num1 - num2;
		 case '*' -> num1 * num2;
		 case '/' -> (num2 != 0) ? num1 / num2 : 0;
		 default -> 0;
	};
		 System.out.println("Result = " + result);
		 sc.close();
	}
}
