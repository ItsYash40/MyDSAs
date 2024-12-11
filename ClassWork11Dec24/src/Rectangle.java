public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double CalculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10.0, 20.0);
        
        double area = r.CalculateArea();
        System.out.println("The area of the rectangle is: " + area +" sq unit");
    }
}
 