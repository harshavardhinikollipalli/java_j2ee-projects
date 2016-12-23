package oops;

public class Prime {
	public static void main(String args[])
	{
		int i,j=5,c=0;
		for(i=1;i<=j;i++)
		{
			if(j%i==0)
			c++;
		
		}
		if(c==2)
		{
		System.out.println("prime");
		}
		else
		{
			System.out.println("not");
	
		}
	}

}
