package oops;

class Five {
	int a,b;
	public void function(int a,int b)
	{
		this.a=a+b;
		this.b=a*b;
	}
	public void function(int b)
	{
		a=this.b+b;
		b=a;
	}
}
	class Second extends Five
	{
		int a,c;
		public void function(int a,int c)
		{
			super.function(a,c);
			super.a=c;
			this.a=a+c;
			this.c=a*c;
		
		}
	}
		class Third extends Second
		{
			int c;
			public void function(int c)
			{
				super.function(c);
				super.c=c;
				this.c=c*c;
				a=this.c;
				b=a;
			}
			
		}
		class First
		{
			public static void main(String args[])
			{
				Third t=new Third();
				t.function(10);
				t.function(2,5);
				Five f=new Third();
				f.function(5);
				f.function(3,2);
				System.out.println(t.a);
				System.out.println(t.b);
				System.out.println(t.c);
				System.out.println(f.a);
				System.out.println(f.b);
			
		
		
			}
		}
	
	


