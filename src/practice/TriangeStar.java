package practice;
public class TriangeStar {
	public static void main(String[] args) {
		int i,j,k;
		System.out.println("Star Triangle");
		for(i=0;i<=4;i++)
		{
			for(j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for(i=0;i<=4;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k<=4;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
}
}