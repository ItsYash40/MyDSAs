import java.util.Scanner;
public class Ass6_Q13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a positive integer number: ");
		int n= sc.nextInt();
		System.out.println("The number choosen by the user is "+ n);
		for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
        sc.close();
	}
}
