package practice;

import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String s=sc.nextLine();
	//String s="Welcome to Java";
	String ss="";
	for(int i=s.length()-1;i>=0;i--)
	{
		ss=ss+s.charAt(i);
	}
	System.out.println(ss);
	if(s.equals(ss))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a Palindrome");
	}
}
}
