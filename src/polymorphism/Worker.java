package polymorphism;

public class Worker extends Employee{
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


	public static void main(String[] args)
	{
		Employee emp=new Employee();
		emp.empDetails(4527);
		emp.empDetails("Jemilan");
		emp.empDetails(300000f);
		emp.empDetails(9003115722l);
	}
}
