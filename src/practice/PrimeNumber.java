package practice;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int count = 0;
	int a=sc.nextInt();
	for(int i=2;i<=a/2;i++)
	{
		if(a%i==0)
		{
         System.out.println(a+" is not a Prime Number");	
         count=1;
         break;
}}
if(count==0)
{
	System.out.println(a+" is a Prime Number");
}	
}}
