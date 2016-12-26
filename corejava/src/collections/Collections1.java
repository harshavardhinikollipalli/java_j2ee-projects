package collections;
import java.util.*;
import java.io.*;
public class Collections1 {
public static void main(String[]args)
{
	ArrayList al=new ArrayList();
	al.add("1000");
	al.add("harshu");
	al.add("23.0");
	ArrayList al2=new ArrayList();
	al2.add(2345);
	al2.add("rishi");
	al2.add(23.456);
	al.addAll(al2);
	al.retainAll(al2);
	Collections1 emp=new Collections1();
	emp.setId(5);
	emp.setName("jaan");
	ArrayList e=new ArrayList();
	e.add(emp);
	Iterator il=al. iterator();
	while(il.hasNext())
	{
		Collections1 emp=(collections1)il.next();
		System.out.println(emp.getId());
	}
}
}
