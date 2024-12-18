import java.util.Scanner;

public class Ass7_Q4 {


	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a 8-bit integer:");
	        long number = scanner.nextLong();
	        long reversedNumber = reverseBits(number);
	         System.out.println("The reversed bits of the number are: " + reversedNumber);
	        scanner.close();
	    }
	    private static long reverseBits(long number) {
	        long reversedNumber = 0;
	        for (int i = 0; i < 8; i++) {
	            reversedNumber <<= 1;
	            reversedNumber |= (number & 1);
	            number >>= 1;
	        }
	        return reversedNumber;
	    }
}
