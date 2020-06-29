package practice;

public class Permutations {

	public static void main(String[] args) {
		String str="GOD";
		String finalstring="";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				finalstring=finalstring+ch[i];
				for(int k=0;k<ch.length;k++) {
					if(k==i) {
						continue;
					}
					finalstring=finalstring+ch[k];
				}
				System.out.println(finalstring);
				finalstring="";
			}
		}
	}
}
