package practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	public boolean isAnagram(String first, String second)
	{
		int f=first.length();
		int s=second.length();
		if(f!=s)
		{
			return false;
		}
		else
		{
			char fir[]=first.toCharArray();
			char sec[]=second.toCharArray();
			Arrays.sort(fir);
			Arrays.sort(sec);
			for(int i=0;i<f;i++)
			{
				if(fir[i]!=sec[i])
				{
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first string:");
	String first=sc.nextLine();
	System.out.println("Enter second string:");
	String second=sc.nextLine();
	AnagramString anag=new AnagramString();
	if(anag.isAnagram(first,second))
	{
		System.out.println("Anagram string");
	}
	else
	{
		System.out.println("Not an Anagram");
	}
}
}
