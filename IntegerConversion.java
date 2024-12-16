public class IntegerConversion {
    public static void main(String[] args) {
        // Example integer
        int primitiveInt = 42;

        // Autoboxing: converting int to Integer automatically
        Integer autoboxedInteger = primitiveInt; // This is autoboxing
        System.out.println("Autoboxed Integer: " + autoboxedInteger);

        // Using constructor: converting int to Integer using the constructor
        Integer constructedInteger = new Integer(primitiveInt); // This uses the constructor
        System.out.println("Constructed Integer: " + constructedInteger);
    }
}