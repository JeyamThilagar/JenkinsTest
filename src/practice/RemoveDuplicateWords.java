package practice;

import java.util.Scanner;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		String str[]=input.split(" ");
		System.out.println("Output:");
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					str[i]=" ";
				}
			}
			if(str[i]!=" ") {
				System.out.print(str[i]+" ");
			}
		}
	}
}
