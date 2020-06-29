package conversionpractice;

import java.util.*;

public class ListPractice {
	
public static void main(String[] args) {
	List<String> list=new ArrayList();
	list.add("Welcome");
	list.add("to");
	list.add("Selenium");
	list.add("Class");
	System.out.println(list);
	String value="";
	for(int i=0;i<list.size();i++)
	{
		value=value+list.get(i)+" ";
	}
	System.out.println(value);
	System.out.println();
	String string="Welcome to Java Class";
	List<String> list1=new ArrayList();
	String value1[]=string.split(" ");
	for(String value2:value1)
	{
		list1.add(value2);
	}
	System.out.println(list1);
	}
}
