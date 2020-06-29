package abstraction;

public class StringHandling {
public static void main(String[] args) {
	String s="Welcome to Java";
	System.out.println(s);
	char c=s.charAt(3);
	System.out.println(c);
	int a=s.length();
	System.out.println(a);
	String b=s.toUpperCase();
	System.out.println(b);
	String d=s.toLowerCase();
	System.out.println(d);
	int e=s.indexOf('v');
	System.out.println(e);
	int f=s.lastIndexOf('e');
	System.out.println(f);
	String g=s.replace('a','e');
	System.out.println(g);
	String h=s.replaceAll("Java","Jeyam");
	System.out.println(h);
	boolean i=s.startsWith("Welcome");
	System.out.println(i);
	boolean j=s.endsWith("Java");
	System.out.println(j);
	boolean k=s.contains("to");
	System.out.println(k);
	String ss="   Welcome to java ";
	System.out.println(ss);
	boolean l=s.equals(ss);
	System.out.println(l);
	boolean m=s.equalsIgnoreCase(ss);
	System.out.println(m);
	int n=s.compareTo(ss);
	System.out.println(n);
	int o=s.compareToIgnoreCase(ss);
	System.out.println(o);
	char ch='j';
	int p=ch;
	System.out.println(p);
	String q=s.substring(5);
	System.out.println(q);
	String r=s.substring(8,15);
	System.out.println(r);
	String t=ss.trim();
	System.out.println(t);
	char ca[]=s.toCharArray();
	for(char x:ca)
	{
		System.out.println(x);
	}
	String[] u=s.split(" ");
    for(String y:u)
    {
	System.out.println(y);
	String v=s.concat(ss);
	System.out.println(v);
}}
}
