package company;

public class Demon2 extends Demon {
public void sunder()
{
	System.out.println("He is Demon Number 1");
}
public void sunder1()
{
	System.out.println("He is Beaver Number 2");
}
public void sunder3()
{
	System.out.println("He is a kid");
}
public static void main(String[] args)
{
	Demon d=new Demon2();
	d.sunder();
	d.sunder1();
	d.sunder2();
}
}