package company;

public class Details extends Employee {
	public void empId()
	{
		System.out.println("Employee ID is:4535");
	}
	public void empName()
	{
		System.out.println("Employee Name is:Jeyam");
	}
	public void empSalary()
	{
		System.out.println("Salary of the Employee:35000.45");
	}
	public void empPhone()
	{
		System.out.println("Phone number of the Employee:9710339937");
	}
	public static void main(String[] args)
	{
		Employee emp=new Details();
		emp.empId();
		emp.empName();
		emp.empSalary();
}
}
