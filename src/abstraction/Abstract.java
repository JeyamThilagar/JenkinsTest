package abstraction;

abstract class Test {
	abstract void run();
public Test()
{
	System.out.println("I got a bike");
}
}


class Honda extends Test
{
	void run() {
		System.out.println("It is a Honda Bike");
	}
}

class Abstract
{
	public static void main(String[] args)
	{
		Honda ab=new Honda();
		ab.run();
	}
	
}