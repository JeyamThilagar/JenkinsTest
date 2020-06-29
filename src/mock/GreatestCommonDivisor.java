package mock;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number to find GCD:");
		int num1=sc.nextInt();
		System.out.println("Enter second number to find GCD:");
		int num2=sc.nextInt();
		System.out.println("The Greatest Common Divisor of "+num1+" and " +num2+" is:" +findGCD(num1,num2));
	}

	private static int findGCD(int num1,int num2) {
		if(num2==0) {
			return num1;
		}
		return findGCD(num2, num1%num2);
	}
}
