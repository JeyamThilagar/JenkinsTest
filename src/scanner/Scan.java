package scanner;
import java.util.Scanner;
public class Scan {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0, count=0;
	//System.out.println("Enter the values");
	while(sc.hasNextInt())
	{
		int num=sc.nextInt();
		sum+=num;
		count++;
	}
	sum=sum/count;
	System.out.println("Final value:"+sum);
}
}
