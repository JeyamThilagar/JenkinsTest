package practice;

import java.util.*;

public class FirstNonreapatedChar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String:");
	String input=sc.nextLine();
	Map<Character,Integer>map=new LinkedHashMap();
	char ch[]=input.toCharArray();
	for(int i=0;i<ch.length;i++){
		if(!map.containsKey(ch[i]))
		{
			map.put(ch[i], 1);
		}
		else {
			map.put(ch[i], map.get(ch[i])+1);
		}
		}
//	System.out.println(map);
	Set<Character>se=map.keySet();
	for(Character x:se) {
		if(map.get(x)==1)
		{
			System.out.println(x);
			break;
		}
	}
	}
}

