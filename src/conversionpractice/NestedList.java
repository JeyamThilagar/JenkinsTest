package conversionpractice;

import java.util.*;

public class NestedList {
public static void main(String[] args) {
	List<String> list= Arrays.asList("Java","Python","Selenium","Php","Html");
	System.out.println(list);
	List<String> list2=Arrays.asList("Mango","Pineapple","Apple","Guavo","Jerry");
	System.out.println(list2);
	List<String> list3=Arrays.asList("Tv","Phone","Laptop","Fridge","Ac");
	System.out.println(list3);
	List<Integer> list4=Arrays.asList(10,40,60,70,40,50);
	System.out.println(list4);
	List<List> lastlist=new ArrayList();
	lastlist.add(list);
	lastlist.add(list2);
	lastlist.add(1, list3);;
	lastlist.add(2, list4);
	System.out.println(lastlist);
	}
}
