import java.util.Scanner;

public class Ass6_Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; 
        }
        
        System.out.println("The sum of the series 1 + 1/2 + 1/3 + ... + 1/" + n + " is: " + sum);
        
        sc.close();

	}

}
