package practice;
import java.util.*;
public class AsciiPrime {
	public static void main(String[] args) {
		int a, flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		{
			for(char c:ch)
			{
				a=c;
				for(int i=2;i<=a/2;i++)
				{
					if(a%i==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.print(a+" ");
				}
				flag=0;
			}
		}
}
}