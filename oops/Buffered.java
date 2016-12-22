package oops;
import java.io.*;

public class Buffered {
	public static void main(String[]args) throws IOException
	{
		BufferedReader j=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter id");
		String rid=j.readLine();
		int id=Integer.parseInt(rid);
		System.out.println("enter name");
		String name=j.readLine();
	System.out.println("enter salary");
	String rsal=j.readLine();
	double sal=Double.parseDouble(rsal);
	System.out.println("id= " +id);
	System.out.println("name= " +name);
	System.out.println("salary= " +sal);
	
	
	}


}
