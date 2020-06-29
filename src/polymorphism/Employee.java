package polymorphism;

public class Employee {
public void empDetails(int id)
{
	System.out.println("Employee ID is:"+id);
}
public void empDetails(String name)
{
	System.out.println("Employee Name is:"+name);
}
public void empDetails(float salary)
{
	System.out.println("Employee Salary is:"+salary);
}
public void empDetails(long phone)
{
	System.out.println("Employee Phone number is:"+phone);
}
public static void main(String[] args)
{
Employee emp=new Employee();
emp.empDetails(3478);
emp.empDetails("Jeyam");
emp.empDetails(30000f);
}
}
