package abstraction;

interface cuckoo
{
	void show();
}

interface dog
{
	void print();
}

class Sound implements cuckoo,dog
{
	public void print()
	{
		System.out.println("Dog is barking");
	}
	public void show()
	{
		System.out.println("Cuckoo is singing");
	}
}


public class MultipleInheritance {
public static void main(String[] args)
{
	cuckoo c=new Sound();
	c.show();
	dog d=new Sound();
	d.print();
}
}
