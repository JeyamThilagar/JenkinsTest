package array;

import java.util.Arrays;

public class Single {
public static void main(String[] args) {
	//int a[]=new int[5];
	 int a[]= {10,20,30,40,50};
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for(int b:a)
	{
		System.out.print(b+" ");
	}
	System.out.println();
	Arrays.stream(a).forEach(System.out::println);
}
}
