package constructors;

public class CopyConstructors {
	int age;
	String name;
public CopyConstructors(String n,int a)
{
	name=n;
	age=a;
	System.out.println(name+" "+age);
}
public CopyConstructors(CopyConstructors copp)
{
	age=copp.age;
	name=copp.name;
	System.out.println(name+" "+age);
}
void diplay()
{
	System.out.println(name+" "+age);
}
public static void main(String[] args)
{
	CopyConstructors cop=new CopyConstructors("Jeyam",26);
	CopyConstructors cop1=new CopyConstructors(cop);
	cop.diplay();
	cop1.diplay();
}
}
