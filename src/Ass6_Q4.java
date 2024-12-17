
public class Ass6_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean primitiveBoolean = true;
        Boolean autoboxedBoolean = primitiveBoolean;
        System.out.println("Autoboxed Boolean: " + autoboxedBoolean);
        Boolean constructedBoolean = new Boolean(primitiveBoolean); 
        System.out.println("Constructed Boolean: " + constructedBoolean);
	}
}
