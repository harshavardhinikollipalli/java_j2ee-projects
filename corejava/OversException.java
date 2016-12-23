package oops;

import java.util.Scanner;
class OverException extends Exception
{
	public String toString()
	{
		return "overs should be lessthan 50";
	}
}

public class OversException {
	public static void main(String[]args)throws OverException
	{

Scanner sc=new Scanner(System.in);
System.out.println("welcome to the match");
System.out.println("enter country1 name");
String a=sc.next();
System.out.println("enter country2 name");
String b=sc.next();
int o1,o2,r1,r2;
int score=0,score1=0;
	System.out.println("enter country1 overs ");
	 o1=sc.nextInt();
if(o1<50)
{
	 System.out.println("enter runrate ");
r1=sc.nextInt();
 score=o1*r1;
	System.out.println("score of country1 is= "+score);
}
else
{
	throw new OverException();
	}
	
		
	System.out.println("enter country2 overs");
	o2=sc.nextInt();
		
	if(o2<50)
	{
		System.out.println("enter runrate");
		 r2=sc.nextInt();
		
		 score1=o2*r2;
		System.out.println("score of country2 is= "+score1);
	}
		else{
			
		
		throw new OverException();
		}
	
	
	if(score>score1)
System.out.println("india wins");
	else
		System.out.println("india loses");
}
}