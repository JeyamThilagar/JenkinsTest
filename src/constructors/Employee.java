package constructors;

public class Employee {
public Employee()
{
	System.out.println("This is a constructor");
}
public Employee(int id)
{
	System.out.println("Employee ID is:"+id);
}
public Employee(String name)
{
	System.out.println("Employee Name is:"+name);
}
public Employee(float Salary)
{
	System.out.println("Employee Salary is:"+Salary);
}
public static void main(String[] args) {
	
	new Employee();
	new Employee(8650);
	new Employee("Jeyam");
	new Employee(40000.00f);
} 
}
