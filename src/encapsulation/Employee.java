package encapsulation;

public class Employee {
private int empId;
private String empName;
private float salary;
/*private int empId=2381;
private String empName="Jeyam";
private float salary=50000f;*/
void setempId(int empId)
{
	this.empId=empId;
}
int getempId()
{
	return empId;
}
void setempName(String Name)
{
	this.empName=Name;
}
String getempName()
{
	return empName;
}
void setsalary(float salary)
{
	this.salary=salary;
}
float getsalary()
{
	return salary;
}
}