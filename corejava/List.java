package oops;

public class List {
	public static void main(String args[])
	{
		int i,j,c=0,n=10;
		for(i=2;i<=n;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
				System.out.println(i);
		}
	}


}
