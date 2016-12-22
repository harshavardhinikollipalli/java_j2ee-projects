package oops;

import java.util.Scanner;

public class Palindrome {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String s1=sc.next();
	
int a,b,c,i;
a=0;
b=s1.length()-1;
c=(a+b)/2;
for( i=a;i<=b;i++)
{
	if(s1.charAt(a)==s1.charAt(b))
	{
	a++;
	b--;
	}
	else
		break;
}
if(i==c+1)
	System.out.println("palindrome");
	else
		System.out.println("not");


	
	
		
	}
		
}

