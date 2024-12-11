
public class Employee {

		    private String name;
		    private int id;
		    private double salary;

		    public Employee(String name, int id, double salary) {
		        this.name = name;
		        this.id = id;
		        this.salary = salary;
		    }

		    public void displayDetails() {
		        System.out.println("Employee Name: " + getName());
		        System.out.println("Employee ID: " + getId());
		        System.out.println("Employee Salary: $ " + getSalary());
		    }

		    private String getName() {
		        return name;
		    }

		    private int getId() {
		        return id;
		    }

		    private double getSalary() {
		        return salary;
		    }

		    public static void main(String[] args) {
		        Employee employee = new Employee("Yash", 9, 2500.00);
		        
		        employee.displayDetails();
		    }
		}
	