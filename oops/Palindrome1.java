package oops;

public class Palindrome1 {
public static void main(String[] args)
{
	
	StringBuffer s1=new StringBuffer("harshu");
	StringBuffer s2=new StringBuffer(s1);
	s1.reverse();
	if(String.valueOf(s1).compareTo(String.valueOf(s2))==0)
		System.out.println("palindrome");
	else
		System.out.println("not");
}
}
		
		
	
		
	
	


