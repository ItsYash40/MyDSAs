import java.util.Scanner;
public class Ass7_Q6 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the dividend (x): ");
	        int x = scanner.nextInt();
	        
	        System.out.print("Enter the divisor (y): ");
	        int y = scanner.nextInt();
	        
	        if (y == 0) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } else {
	            int result = divide(x, y);
	            System.out.println("Result of " + x + " / " + y + " = " + result);
	        }
	        
	        scanner.close();
	    }
	    public static int divide(int x, int y) {
	        boolean isNegative = (x < 0) ^ (y < 0); 
	        x = Math.abs(x);
	        y = Math.abs(y);
	        
	        int quotient = 0;
	        int temp = 0;
	        for (int i = 31; i >= 0; i--) {
	            if ((temp + (y << i)) <= x) {
	                temp += (y << i);
	                quotient |= (1 << i);
	            }
	        }
	        
	        return isNegative ? -quotient : quotient;
	    }
	}
