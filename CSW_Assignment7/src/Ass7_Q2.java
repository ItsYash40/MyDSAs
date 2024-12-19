import java.util.Scanner;
public class Ass7_Q2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        
	        int parity = calculateParity(number);
	        
	        System.out.println("Parity of the number: " + parity);
	        
	        scanner.close();
	    }
	    public static int calculateParity(int n) {
	        int count = 0;
	        
	        while (n > 0) {
	            count += (n & 1);
	            n >>= 1;
	        }
	        return (count % 2 == 1) ? 1 : 0;
	    }
}
