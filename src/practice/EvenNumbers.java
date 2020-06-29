package practice;
public class EvenNumbers{
public static void main(String[] args)
{   
	int count=0;
	System.out.println("Number of Even numbers from 1 to 100");
	for(int i=1;i<=100;i++)
	{
	if(i%2==0)
		{
	     count=count+1;
		}
		}
	System.out.println(count);
}
}