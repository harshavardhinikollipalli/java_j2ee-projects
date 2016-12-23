package oops;
import java.util.*;
public class StringMethods {
public static void main(String[]args)
{
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter strings");
	String s1=sc.next();
	String s2=sc.next();
	for(i=0;i<=s1.length()-1;i++)
		System.out.println(s1.charAt(i));
	char ch=s2.charAt(4);
	System.out.println(ch);
	System.out.println(s1.compareTo(s2));
	s1=s1.concat(s2);
	System.out.println(s1);
	System.out.println(s1.substring(4));
	System.out.println(s1.substring(2,6));
	System.out.println(s1.equals(s2));
	System.out.println(s1.replace('s','m'));
	System.out.println(s1.startsWith("ha"));
	System.out.println(s1.startsWith("se",0));
	System.out.println(s1.toUpperCase());
	System.out.println(s1.endsWith("u"));
	System.out.println(s1.matches(s2));
	String s3="";
	System.out.println(s3.isEmpty());
	System.out.println(s1.lastIndexOf("ekku"));
	System.out.println(s1.intern());
	System.out.println(s1.toString());
	System.out.println(s1.subSequence(2,4));
	char[] hm=s1.toCharArray();
	System.out.println(s1);
	System.out.println(String.valueOf('u'));
	System.out.println(s1.contains("sek"));
	System.out.println(s1.replaceAll("ha","se"));
	System.out.println(s1.indexOf("e"));
	System.out.println(s1.offsetByCodePoints(2,1));
	

}
}
