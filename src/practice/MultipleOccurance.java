package practice;

import java.util.*;
import java.util.Map.Entry;

public class MultipleOccurance {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String ss = s.nextLine();
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		char[] ch = ss.toCharArray();
		for (char c : ch) {
			if (!m.containsKey(c)) {
				m.put(c, 1);
			} else {
				m.put(c, m.get(c) + 1);
			}
		}
		System.out.println(m);
		String mu = "";
		Set<Entry<Character, Integer>> se = m.entrySet();
		for (Entry<Character, Integer> c : se) {
			mu = mu + c;
		}
		String sec = mu.replace("=", "");
		System.out.println(mu);
		System.out.println(sec);
	}
}
