package constructors;

public class SuperFunction extends ThisFunction{
public SuperFunction()
{
	this(2308);
	System.out.println("Child class Constructor");
}
public SuperFunction(int id)
{
	super("Jemilan");
	System.out.println("Employee Id is:"+id);
}
public static void main(String[] args)
{
	new SuperFunction();
}
}
