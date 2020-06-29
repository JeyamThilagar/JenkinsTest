package mock;

public class ArraySort {

	public static void main(String[] args) {
		int[] a= {1,5,3,8,2,9,4,7,6};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int length=a.length-1;
		for(int z=0;z<length/2;z++) {
			System.out.print(a[z]+" ");
			System.out.print(a[length]-z+" ");
		}
	}
}
