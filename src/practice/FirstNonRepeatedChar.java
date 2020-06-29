package practice;

import java.util.Scanner;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		int count=0;
		char ch[]=input.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]!=ch[j]) {
					count=1;
				}
				if(ch[i]==ch[j]) {
					break;
				} 
				else {
				System.out.println(ch[j]);
				return;
				}
			}
		}
	}
}
