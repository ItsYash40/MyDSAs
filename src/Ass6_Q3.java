
public class Ass6_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Double = 14;
		double autoboxedInteger = Double; 
        System.out.println("Autoboxed Integer: " + autoboxedInteger);
        double constructedInteger = new Double(Double); 
        System.out.println("Constructed Integer: " + constructedInteger);
	}
}