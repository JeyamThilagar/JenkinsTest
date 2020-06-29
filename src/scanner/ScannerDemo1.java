package scanner;
import java.util.Scanner;
public class ScannerDemo1 {
public static void main(String[] args) {
	System.out.println("Enter the String:");
	Scanner scan=new Scanner(System.in);
	String name=scan.next();
	System.out.println("The string is:"+name);
	System.out.println("Enter a number:");
	int number=scan.nextInt();
	System.out.println("The number is:"+number);
	System.out.println("Enter a name:");
	char ch=scan.next().charAt(2);
	System.out.println("Thc charactor is:"+ch);
}
}
