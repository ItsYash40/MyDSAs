import java.util.Scanner;

public class Ass7_Q5 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the first integer (x): ");
	        int x = scanner.nextInt();
	        
	        System.out.print("Enter the second integer (y): ");
	        int y = scanner.nextInt();
	        
	        int result = multiply(x, y);
	        
	        System.out.println("Result of " + x + " X " + y + " = " + result);
	        
	        scanner.close();
	    }
	    public static int multiply(int x, int y) {
	        boolean isNegative = (x < 0) ^ (y < 0); 
	        x = Math.abs(x);
	        y = Math.abs(y);
	        int result = 0;
	        while (y > 0) {
	            if ((y & 1) == 1) {
	                result = add(result, x);
	            }
	            y >>= 1;
	            x <<= 1;
	        }
	        return isNegative ? -result : result;
	    }
	    public static int add(int a, int b) {
	        while (b != 0) {
	            int carry = a & b;
	            a = a ^ b;
	            b = carry << 1;
	        }
	        return a;
	    }
	}


