package oops;

abstract class calculator
{
	public abstract int sum(int a,int b);
	public abstract int sub(int a,int b);
	public abstract int mul(int a,int b);
	public abstract int div(int a,int b);

}
abstract class cal extends calculator
{
	
	public int sum(int a,int b)
	{
		
		
		return a+b;
}
}
class cal1 extends cal
{
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
}
class Abstraction
{
	public static void main(String[] args)
	{
		
		cal1 d=new cal1();
		System.out.println(d.sum(2,5));
		System.out.println(d.sub(4,2));
		System.out.println(d.mul(5,4));
		System.out.println(d.div(6,3));
	}
	
}