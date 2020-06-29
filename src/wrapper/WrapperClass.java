package wrapper;

public class WrapperClass {
public static void main(String[] args)
{
	int a=10;
	Integer wrp=new Integer(a); //wrapping
	int b=wrp.intValue();  //Unwrapping
	System.out.println(b);
	int c=20;
	Integer aut=c;  //AutoWrapping
	int d=aut.intValue();  //AutoUnwrapping
	System.out.println(d);
}
}
