package encapsulation;

public class EmployeeDetails {
private int empId;
private String empName;
private double salary;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public static void main(String[] args) {
	EmployeeDetails emp=new EmployeeDetails();
	emp.setEmpId(1480);
	emp.setEmpName("Jeyam");
	emp.setSalary(35000);
	System.out.println("Employee Id is:"+emp.getEmpId());
	System.out.println("Employee Name is:"+emp.getEmpName());
	System.out.println("Employee Salary is:"+emp.getSalary());
}
}
