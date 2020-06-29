package mock;

public class ArrayAddEquals {
//	
//	public int arraySplit(int a[],int n) {
//		int leftsum=0;
//		for(int i=0;i<n;i++) {
//			leftsum+=a[i];
//			int rightsum=0;
//			for(int j=i+1;j<n;j++) {
//				rightsum+=a[j];
//			}
//			if(leftsum==rightsum) {
//				return i+1;
//			}
//		}
//		return -1;
//	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int x=a.length/2;
		int count=0;
		int array[] = new int[x];
		int array2[] = new int[x];
		int length=a.length-1;
		for(int i=0;i<a.length/2;i++) {
			if(count%2==0) {
			array[i]=a[i];
			array[i+1]=a[length-i];
			} else {
				array2[i-1]=a[i];
				array2[i]=a[length-i];
			}
			count++;
		}
		System.out.print("First Array:");
		for(int j=0;j<array.length;j++) {
			System.out.print(array[j]+" ");
		}
		System.out.println();
		System.out.print("Second Array:");
		for(int j=0;j<array2.length;j++) {
			System.out.print(+array2[j]+" ");
		}
//		ArrayAddEquals arr=new ArrayAddEquals();
//		int length=arr.arraySplit(a, a.length);
//		if(length==-1||length==a.length) {
//			System.out.println("Not possible");
//			return;
//		}
//		for(int i=0;i<a.length;i++) {
//			if(length==i) {
//				System.out.println();
//			}
//			System.out.print(a[i]+" ");
//		}
	}
}