package practice;
import java.util.Scanner;
public class BinaryToDecimal {
	    public static void main(String args[]){
	       Scanner input = new Scanner( System.in );
	       System.out.print("Enter a binary number: ");
	    //   System.out.println(Integer.toBinaryString(-10));
	       String binaryString =input.nextLine();
	       System.out.println("Output: "+Integer.parseInt(binaryString,2));
	    }
	}