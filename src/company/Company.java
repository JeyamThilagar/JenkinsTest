package company;

public class Company {
private void empDetails(int Id)
{
	System.out.println("Employee ID is:"+Id);
}
private void empDetails(String Name)
{
	System.out.println("Employee Name is:"+Name);
}
private void empDetails(Float Salary,Long Phone)
{
	System.out.println("Salary of the Employee:"+Salary+"\n"+"Phone Number of the Employee:"+Phone);
}
public static void main(String[] args)
{
	Company com=new Company();
	com.empDetails(3490);
	com.empDetails("Jeyam");
	com.empDetails(30000.4f,9710339937l);
}
}
