package oops;

public class StringExample {
public static void main(String[]args)
{
	String s1=new String("harshu");
	String s2="harshu";
	String s3=new String("harshu");
	String s4="harshu";
	if(s1.equals(s2))
		System.out.println("yes");
	else
		System.out.println("no");
	if(s3==s4)
		System.out.println("obj same");
	else 
		System.out.println("obj diff");
	 s1=new String("dhatri");
	 s2="dhatri";
	 if(s1.equals(s2))
		 System.out.println("same obj");
	 else
		 System.out.println("diff obj");
	
}
}
