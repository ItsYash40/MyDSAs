import java.util.Scanner;
public class Ass7_Q7 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the base (x): ");
	        double x = scanner.nextDouble();
	        
	        System.out.print("Enter the exponent (y): ");
	        int y = scanner.nextInt();
	        
	        double resultIterative = powerIterative(x, y);
	        System.out.println("Result of " + x + "^" + y + " (Iterative): " + resultIterative);
	        
	        double resultRecursive = powerRecursive(x, y);
	        System.out.println("Result of " + x + "^" + y + " (Recursive): " + resultRecursive);
	        
	        scanner.close();
	    }
	    public static double powerIterative(double x, int y) {
	        double result = 1.0;
	        boolean isNegativeExponent = y < 0;
	        
	        y = Math.abs(y);
	        
	        for (int i = 0; i < y; i++) {
	            result *= x;
	        }
	        
	        return isNegativeExponent ? 1.0 / result : result;
	    }
	    public static double powerRecursive(double x, int y) {
	        if (y == 0) {
	            return 1.0; // x^0 = 1
	        }
	        if (y < 0) {
	            return 1.0 / powerRecursive(x, -y);
	        }
	        return x * powerRecursive(x, y - 1);
	    }
	    }