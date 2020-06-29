package practice;

import java.util.Scanner;

public class SwapString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String A:");
	String a=sc.nextLine();
	System.out.println("Enter String B:");
	String b=sc.nextLine();
	a=a+b;
	b=a.substring(0, a.length()-b.length());
	a=a.substring(b.length());
	System.out.println(a);
	System.out.println(b);
	}
}
