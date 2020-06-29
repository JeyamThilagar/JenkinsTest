package encapsulation;

public class Capsule {
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		emp.setempId(1476);
		System.out.println("Employee ID is:"+emp.getempId());
		emp.setempName("Jeyam");
		System.out.println("Employee Name is:"+emp.getempName());
		emp.setsalary(50000f);
		System.out.println("Employee Salary is:"+emp.getsalary());
	}
	}
