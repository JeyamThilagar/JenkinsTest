package practice;

public class FindMissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7,8};
		int n=arr.length+1;
		int total=n*(n+1)/2;
		for(int i=0;i<arr.length;i++) {
			total-=arr[i];
		}
		System.out.println("Missing number is:"+total);
	}
}
