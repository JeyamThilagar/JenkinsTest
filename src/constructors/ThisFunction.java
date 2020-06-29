package constructors;

public class ThisFunction {
public ThisFunction()
{
	this(5480);
	System.out.println("This is a constructor");
}
public ThisFunction(int id)
{
	this("Jeyam");
	System.out.println("Employee Id is:"+id);
}
public ThisFunction(String name)
{
	this(40000f);
	System.out.println("Employee Name is:"+name);
}
public ThisFunction(float salary)
{
	System.out.println("Employee Salary is:"+salary);
}
public static void main(String[] args)
{
	new ThisFunction();
}
}
