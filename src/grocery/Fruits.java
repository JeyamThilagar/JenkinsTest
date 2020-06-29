package grocery;
import employee.Employee;
public class Fruits extends Vegetables {
	private void orange()
	{
		System.out.println("Number of Oranges:5");
	}
	private void apple()
	{
		System.out.println("Number of Apples:6");
	}

public static void main(String[] args) {
	Fruits fr=new Fruits();
	fr.orange();
	fr.apple();
	fr.carrot();
	fr.beetroot();
	Employee emp=new Employee();
	emp.empId();
	emp.empName();
}
}
