package mock;

public class ArrayCompare {

	public static void main(String[] args) {
		int a[]= {1,3,4,5};
		int b[]= {3,2,3,1};
		if(a.length>4 || b.length>4) {
			System.out.println("Invalid Array Size");
		} else {
			for(int i=0;i<a.length;i++) {
				if(a[i]<0 || b[i]<0) {
					System.out.println("Array elements are negative");
				} else if(a[i]>b[i]) {
					System.out.print(a[i]+" ");
				} else {
					System.out.print(b[i]+" ");
				}
			}
		}
	}
}
