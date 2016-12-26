package collections;
import java.util.*;
public class Collections2 {
	public static void main(String[]args)
	{
	ArrayList al=new ArrayList();
	al.add(1000);
	al.add("harshu");
	al.add("23.0");
	al.add(1000);
	al.indexOf(1000);
	al.removeAll(al);
	
	ArrayList<Integer> al2=new ArrayList<Integer>();
	al2.add(23);
	al2.add(24);
	al2.add(78);
	al.retainAll(al2);
	
	al.addAll(al2);
	
	
	
	
	Iterator il=al. iterator();
	while(il.hasNext())
	{
		System.out.println(il.next());
	}
}
}
