package abstraction;

public class Bank {
public static void main(String[] args)
{
	hdfcbank hdfc=new hdfcbank();
	System.out.println("Interest rate of Hdfc Bank:"+hdfc.getInterestRateOf());
	sbi s=new sbi();
System.out.println("Interest rate of Sbi:"+s.getInterestRateOf());
}
}


abstract class Bank1
{
	abstract int getInterestRateOf();
}

class sbi extends Bank1
{
	int getInterestRateOf()
	{
return 7;
}
}

class hdfcbank extends Bank1
{
	int getInterestRateOf()
	{
		return 8;
	}
}