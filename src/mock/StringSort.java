package mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		String[] str={"Gmail","Yahoo","Rediff","Google"};
		List<String>list=new ArrayList<String>();
		String midstring="";
		for(String st:str) {
			for(int i=st.length()-1;i>=0;i--) {
				midstring=midstring+st.charAt(i);
			}
			list.add(midstring);
			midstring="";
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
