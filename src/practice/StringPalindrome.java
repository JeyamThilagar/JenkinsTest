package practice;
import java.util.Scanner;
public class StringPalindrome {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a string");
	String a=s.nextLine();
	System.out.println(a);
	String b[]=a.split(" ");
	for(String c:b)
	{
		for(int d=c.length()-1;d>=0;d--)
		{
			System.out.print(c.charAt(d));
		}
		System.out.print(" ");
		}
}
}
