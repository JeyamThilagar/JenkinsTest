package practice;

import java.util.Scanner;

public class DuplicateCharRemove {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=sc.nextLine();
		char ch[]=input.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j])
				{
					ch[i]=' ';
				}
			}
			if(ch[i]!=' ')
			{
				System.out.println(ch[i]);
			}
		}
	}
}
