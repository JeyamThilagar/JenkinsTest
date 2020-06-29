package collection;
import java.util.*;
public class Collector {
public static void main(String[] args) {
List<Integer> li=new ArrayList();
li.add(10);
li.add(20);
li.add(30);
li.add(40);
li.add(50);
System.out.println(li.size());
System.out.println(li);
//Normal for
for(int i=0;i<li.size();i++)
{
	System.out.println(li.get(i));
}
//Enhanced for
for(Integer x:li)
{
	System.out.println(x);
}
//For each
li.forEach(System.out::println);
li.forEach((v)->
{
System.out.println(v);
});
//while
int b=0;
while(b<li.size())
{
	System.out.println(li.get(b));
	b++;
}
//Do while
int c=0;
do {
	System.out.println(li.get(c));
	c++;
}while(c<li.size());
//Iterator
Iterator i=li.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
//List Iterator
ListIterator<Integer> j=li.listIterator();
while(j.hasNext())
{
	System.out.println(j.next());
}
while(j.hasPrevious())
{
	System.out.println(j.previous());
}
}
}