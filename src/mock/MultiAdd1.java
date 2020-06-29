package mock;

import java.util.LinkedHashMap;
import java.util.Map;

public class MultiAdd1 {

	public static void main(String[] args) {
		String str = "Hello Java World";
		String s="";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			} else {
				map.put(ch[i], map.get(ch[i]) + 1);
			}
		}
		map.forEach((k, v) -> {
//			s=s+(k, v);
//			String s = new String("" + k + v);
			System.out.print(s);
		});
	}
}
