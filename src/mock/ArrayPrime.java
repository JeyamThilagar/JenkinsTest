package mock;

public class ArrayPrime {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			int x=a[i];
			int count =0;
			for(int j=2;j<=x/2;j++) {
				if(x%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(x);
			}
		}
	}
}
