package oops;
import java.util.*;
import java.util.Scanner;

public class Diamond {
	public static void main(String[]args)
	{
		int i,j,k,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			
				System.out.print(" ");
				for(k=0;k<i;k++)
				{
					System.out.print(" ");
					System.out.print("*");
				}
			System.out.println();
		}
	}

}
