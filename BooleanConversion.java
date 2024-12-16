
public class BooleanConversion {

	    public static void main(String[] args) {
	        boolean primitiveBoolean = true;

	        Boolean autoboxedBoolean = primitiveBoolean;
	        System.out.println("Autoboxed Boolean: " + autoboxedBoolean);

	        Boolean constructedBoolean = new Boolean(primitiveBoolean); 
	        System.out.println("Constructed Boolean: " + constructedBoolean);
	    }
	}


