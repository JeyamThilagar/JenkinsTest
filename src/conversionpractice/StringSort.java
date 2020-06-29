package conversionpractice;

import java.util.*;

public class StringSort {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a String");
	String input=scan.nextLine();
	String sort="";
	char character[]=input.toCharArray();
	int length=character.length-1;
	char last=character[length];
	sort=last+sort;
	for(int i=0;i<length;i++)
	{
		sort=sort+character[i];
	}
	System.out.println(sort);
	}
}
