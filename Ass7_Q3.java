	import java.util.Scanner;

public class Ass7_Q3 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        
	        System.out.print("Enter the index of the first bit (i): ");
	        int i = scanner.nextInt();
	        
	        System.out.print("Enter the index of the second bit (j): ");
	        int j = scanner.nextInt();
	        
	        int swappedNumber = swapBits(number, i, j);
	        
	        System.out.println("Original number: " + number);
	        System.out.println("Number after swapping bits: " + swappedNumber);
	        
	        scanner.close();
	    }

	    public static int swapBits(int n, int i, int j) {
	        if (((n >> i) & 1) != ((n >> j) & 1)) {
	            int bitMask = (1 << i) | (1 << j);
	            n ^= bitMask;
	        }
	        return n;
	    }
	}


