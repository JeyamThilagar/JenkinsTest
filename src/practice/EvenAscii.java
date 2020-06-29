package practice;
import java.util.*;
public class EvenAscii {
public static void main(String[] args) {
	int b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String a=sc.nextLine();
	char ch[]=a.toCharArray();
	{
		for(char c:ch)
		{
			b=c;
			if(b%2==0)
			{
				System.out.print(b+" ");
			}
		}
	}
}
}
