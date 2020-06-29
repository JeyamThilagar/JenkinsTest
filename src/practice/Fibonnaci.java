package practice;

public class Fibonnaci {
public void fibon()
{
	int a=0;
	int b=1;
	System.out.println("Fibonnaci Series:");
	while(a<=1000)
	{
		System.out.print(a+" ");
		int c=a+b;
		a=b;
		b=c;
	}
}
public static void main(String[] args)
{
	Fibonnaci fib=new Fibonnaci();
	fib.fibon();
}
}
