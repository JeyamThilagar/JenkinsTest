package practice;

import java.util.Arrays;

public class SmallestNumberArray {

	public static void main(String[] args) {
		int temp=0;
		int num[]= {10,20,30,80,60,40};
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Smallest number is:"+num[0]);
//		Arrays.sort(num);
//		for(int i=0;i<num.length;i++) {
//		System.out.println(num[i]);
//		}
	}
}
