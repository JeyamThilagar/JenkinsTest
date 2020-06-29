package practice;

public class DuplicateArray {

	public static void main(String[] args) {
		int dup[]= {30,40,80,20,30,20,50};
		System.out.println("Duplicate values in the Array:");
		for(int i=0;i<dup.length;i++) {
			for(int j=i+1;j<dup.length;j++) {
				if(dup[i]==dup[j]) {
					System.out.print(dup[i]+" ");
				}
			}
		}
	}
}
