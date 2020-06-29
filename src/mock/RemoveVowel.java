package mock;

public class RemoveVowel {

	public static void main(String[] args) {
		String str="Selenium";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char x=ch[i];
			if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u') {
				ch[i]=' ';
			}
		}
		String str1="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				str1=str1+ch[i];
			}
		}
		System.out.println(str1);
	}
}
