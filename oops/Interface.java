package oops;
interface ABC
{
	int k=0;
	public void function();
	public static final float pi=3.14f;
	public abstract void functionOne(int x,int y);
	public abstract void functionTwo(int c,int d);
}
abstract  class Ex implements ABC
{
	public void function()
	{
		System.out.println("k= "+k);
		System.out.println("pi= "+pi);
	}
}
abstract  class Ex1 extends Ex
{
	public void functionOne(int x,int y)
	{
		int k=3;
		x=k+k;
		y=(int)pi+k;
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
	
}
public class Interface extends Ex1
{
	public void functionTwo(int c,int d)
	{
		int k=6;
		c=k*k;
		d=(int)pi*k;
		System.out.println("c= "+c);
		System.out.println("d= "+d);
		
	}
	public static void main(String[]args)
	{
		Interface e=new Interface();
		e.functionOne(2,5);
		e.function();
		e.functionTwo(7,3);
		
	}
}