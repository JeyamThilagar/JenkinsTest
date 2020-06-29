package abstraction;

interface bank2
{
int getInterestRateOf();
static int cube(int x) {
	return x*x*x;
}
}

class sbi1 implements bank2
{
public int getInterestRateOf()
{
	return 8;
}
}

class hdfcbank1 implements bank2
{
	public int getInterestRateOf()
	{
		return 9;
	}
}

public class Interface {
	public static void main(String[] args)
	{
		bank2 b=new sbi1();
		bank2 b1=new hdfcbank1();
		System.out.println("Rate of Interest:"+b.getInterestRateOf());
		System.out.println("Rate of Interest:"+b1.getInterestRateOf());
		System.out.println("The cube of the given value:"+bank2.cube(5));
	}
}
