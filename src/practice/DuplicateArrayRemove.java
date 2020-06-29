package practice;

public class DuplicateArrayRemove {

	public static void main(String[] args) {
		int dup[]= {30,40,80,20,30,20,50};
		System.out.println("Array without duplicate values:");
		for(int i=0;i<dup.length;i++) {
			for(int j=i+1;j<dup.length;j++) {
				if(dup[i]==dup[j]) {
					dup[i]=0;
				}
			}
			if(dup[i]!=0) {
				System.out.print(dup[i]+" ");
			}
		}
	}
}
