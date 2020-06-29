package practice;

public class Palindrome {
public static void main(String[] args)
{
	int sum=0;
	int n=877;
	int temp=n;
		while(temp>0)
	{
		int r=temp%10;
		sum=(sum*10)+r;
		temp=temp/10;
	}
	if(n==sum)
	{
		System.out.println("Palindrome Number");
	}
	else
	{
		System.out.println("Not a Palindrome Number");
	}
}
}
