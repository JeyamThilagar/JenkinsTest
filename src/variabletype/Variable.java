package variabletype;

public class Variable {
int empId;
static String name;
long phone;
public void print()
{
	System.out.println(empId+" "+name+" "+phone);
}
public void Sal()
{
	double salary=40000;
	System.out.println("Employee Salary is:"+salary);
}
public static void main(String[] args)
{
	Variable var=new Variable();
	Variable.name="Jeyam";
	var.empId=1356;
	var.phone=9710339937l;
	var.print();
	Variable var1=new Variable();
	var1.empId=2812;
	var1.phone=9003115722l;
	var1.print();
	var.Sal();
		}
}