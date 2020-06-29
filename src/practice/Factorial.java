package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for Factorial");
		int num=sc.nextInt();
		int factorial=num;
		while(num>1) {
			num--;
			factorial=factorial*num;
		}
		System.out.println("Factorial of the given number is:"+factorial);
	}
}
