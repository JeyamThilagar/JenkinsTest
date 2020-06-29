package constructors;

public class CopyConstructor {
	String name;
	int age;
public CopyConstructor(String n,int a)
{
	name=n;
	age=a;
}
public CopyConstructor()
{
}
void diplay()
{
	System.out.println(name+" "+age);
}
public static void main(String[] args)
{
	CopyConstructor cop=new CopyConstructor("Jeyam",26);
	CopyConstructor cop1=new CopyConstructor();
	cop1.name=cop.name;
	cop1.age=cop.age;
	cop.diplay();
	cop1.diplay();
}
}
