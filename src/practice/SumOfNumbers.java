package practice;
import java.util.*;
public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int i,sum=0;
		int num=sc.nextInt();
		while(num>0)
		{
			i=num%10;
			sum=sum+i;
			num=num/10;
		}
		System.out.println("Sum of Numbers:"+sum);
	}
}

