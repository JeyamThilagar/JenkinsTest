package conversionpractice;

import java.util.*;

public class Vowels {
public static void main(String[] args) {
	String vowel[]= {"Google","Yahoo","Gmail","Twitter"};
//	List<String> li=new ArrayList(Arrays.asList(vowel));
//	System.out.println(li);
//	for(int j=0;j<li.size();i++) {
//		char[] vow=li.get[i].toCharArray();
//		for(int i=0;i<vow.length-1;i++) {
//			if((vow[i]=='a'||vow[i]=='e'||vow[i]=='i'||vow[i]=='o'||vow[i]=='u')&&(vow[i+1]=='a'||vow[i+1]=='e'||vow[i+1]=='i'||vow[i+1]=='o'||vow[i+1]=='u')) {
//				li.remove(newli);
//			}
//		}
//	}
//	System.out.println(li);
	List<String>wholestring=new ArrayList();
	List<String>vowelstring=new ArrayList();
	for(String string:vowel)
	{
		wholestring.add(string);
		char character[]= string.toCharArray();
		for(int iterator= 0; iterator<string.length()-1; iterator++ )
		{
			if(isvowel(character[iterator])&&isvowel(character[iterator+1])){
			vowelstring.add(string);
			}
		}
	}
	wholestring.removeAll(vowelstring);
	System.out.println(wholestring);
}

private static boolean isvowel(char character) {
	if(character=='i'||character=='e'||character=='a'||character=='o'||character=='u')
	{
		return true;
	}
	return false;
	}
}
