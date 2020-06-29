package mock;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MultiAdd {

	public static void main(String[] args) {
		String str="Hello Java World";
		char[] character=str.toCharArray();
		Map<Character, Integer>map=new LinkedHashMap<Character, Integer>();
		for(char newchar:character) {
			if(!map.containsKey(newchar)) {
				map.put(newchar, 1);
			} else {
				map.put(newchar, map.get(newchar)+1);
			}
		}
		String occurance="";
		Set<Entry<Character,Integer>> entry=map.entrySet();
		for(Entry<Character,Integer>e:entry) {
			occurance=occurance+e;
		}
		String finalvalue=occurance.replace("=", "");
		System.out.println(finalvalue);
		char[] digitadd=finalvalue.toCharArray();
		int digit=0;
		for(int i=0;i<digitadd.length;i++) {
			if(Character.isDigit(digitadd[i])) {
				String digits="";
				digits=digits+digitadd[i];
				digit=digit+Integer.parseInt(digits);
			}
		}
		System.out.println(digit);
	}
}
