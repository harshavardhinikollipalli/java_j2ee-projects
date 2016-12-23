package oops;

import java.util.Scanner;

 class Test extends Exception{
public String toString()
{
	return "age should be greater than 25";
}
}
class AgeException
{
	public static void main(String[]args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age>25)
			System.out.println("you are eligible");
		else
		{
			throw new Test();
		}
	}
}