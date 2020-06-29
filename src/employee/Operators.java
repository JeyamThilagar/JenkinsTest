package employee;

public class Operators {
public static void main(String[] args)
{
	int a=10;
	int b=6;
	System.out.println(a+b);
	System.out.println(a/b);
	System.out.println(a%b);
	System.out.println(a>b);
	System.out.println(a!=b);
	System.out.println(a>b && a==b);
	System.out.println(a>b || a<=b);
	System.out.println(a<b | a==b);
	System.out.println(a+++" "+a++);
	System.out.println(a);
	System.out.println(++a+" "+--a);
	System.out.println(a>b?1:2);
    a+=3.8;
	System.out.println(a);
int c=a++;
System.out.println(a);
System.out.println(++c);
}
}
