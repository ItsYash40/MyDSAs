	import java.util.Scanner;

public class Ass7_Q1 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        
	        int count = countSetBits(number);
	        
	        System.out.println("Number of bits set to one: " + count);
	        
	        scanner.close();
	    }

	    public static int countSetBits(int n) {
	        int count = 0;
	        
	        while (n > 0) {
	            count += (n & 1);
	            n >>= 1;
	        }
	        return count;
	    
	}

}
