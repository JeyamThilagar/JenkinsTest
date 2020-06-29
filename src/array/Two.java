package array;

public class Two {
public static void main(String[] args) {
	int a[][]=new int[4][4];
	// int a[][]={{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}}
	a[0][0]=10;
	a[0][1]=20;
	a[0][2]=30;
	a[0][3]=40;
	a[1][0]=50;
	a[1][1]=60;
	a[1][2]=70;
	a[1][3]=80;
	a[2][0]=90;
	a[2][1]=100;
	a[2][2]=110;
	a[2][3]=120;
	a[3][0]=130;
	a[3][1]=140;
	a[3][2]=150;
	a[3][3]=160;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	for(int x[]:a)
	{
		for(int y:x)
		{
			System.out.print(y+" ");
		}
		System.out.println();
	}
}
}
