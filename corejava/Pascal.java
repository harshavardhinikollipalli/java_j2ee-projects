package oops;
import java.util.*;
public class Pascal {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int i,j,num,r;
		for(i=0;i<n;i++)
		{
			for(int k=i;k<n;k++)
				System.out.print(" ");
			num=1;
			r=i+1;
			for(j=0;j<=i;j++)
			{
				if(j>0)
					num=num*(r-j)/j;
				System.out.print(num+ " ");
			}
			System.out.println();
		}
	}
	

}
