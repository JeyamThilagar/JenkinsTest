package practice;

import java.util.*;

public class DuplicateCharString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String input=sc.nextLine();
	Map<Character,Integer>map=new LinkedHashMap();
	char ch[]=input.toCharArray();
	for(int i=0;i<input.length();i++){
		if(map.containsKey(ch[i])){
			map.put(ch[i], map.get(ch[i])+1);
		}
		else{
			map.put(ch[i], 1);
		}
	}
	Set<Character>coll=map.keySet();
	System.out.print("Duplicate characters are:");
	for(Character x:coll)
	{
		if(map.get(x)>1)
		{
			System.out.print(x);
		}
	}
}
}
