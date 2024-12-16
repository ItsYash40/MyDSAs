package chap11;

public class Assignment6_Q9 {

	public static void main(String[] args) 
	{
		String num1 = "43";
        Integer i = Integer.valueOf (num1);
        System.out.println("Integer object: " + i);
        
        String num2 = "23.4f";
        Float f = Float.valueOf (num2);
        System.out.println("Float object: " + f);
        
        String num3 = "17.9";
        Double d = Double.valueOf (num3);
        System.out.println("Double object: " + d);
        
        String num4 = "true";
        Boolean b = Boolean.valueOf (num4);
        System.out.println("Boolean object: " + b);
	

	}

}
