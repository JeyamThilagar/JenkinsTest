package mock;

public class ArrayArrange {

	public static void main(String[] args) {
		int a[]= {3,4,1,5};
		int temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
		}
	}
}
