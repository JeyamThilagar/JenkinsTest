package practice;
import java.util.*;
public class ArmstrongNumber {
public static void main(String[] args) {
	int i,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int num=sc.nextInt();
	int temp=num;
	while(temp>0)
	{
		i=temp%10;
		sum=(i*i*i)+sum;
		temp=temp/10;
	}
	if(sum==num)
	{
		System.out.println("Armstrong Number");
	}
	else
	{
		System.out.println("Not a Armstrong Number");
	}
}
}
