package oops;
import java.util.Scanner;

 class Example1 {
int a,b;
static float f1,f2,f3;
Example1()
{
	this.a=a*b;
	this.b=this.a+b;
	
}
public  int function(int a,int b)
{
	Example1 e1=new Example1();
	this.a=a+b;
	b=(int)f1+this.a;
	this.b=this.a+b;
	return this.a+this.b;
}
public void functionOne(float f1,float f2)
{
	Example1.f1=f1+f2;
	f2=f1*f2;
}
Example1(float f1,float f2)
{
	f1=(int)f1+Example1.f2;
	f2=Example1.f1*Example1.f2;
	Example1.f1=(int)f1+f2;
	Example1.f2=f2+Example1.f2;
}
Example1(float f1,float f2,float f3)
{
	Example1.f1=f1+f2;
	Example1.f2=Example1.f1*f1;
	Example1.f3=f1+f2+Example1.f3;
	
}
}
class Example extends Example1
{
	 int a,b;
	static long l1,l2;
	Example()
	{
		super();
		
	}
	
	public int functionOne(int a)
	{
		this.a=a+b;
		return this.a;
	}
	public int function(int a,int b)
	{
		
		super.a=b;
      a=this.a+b;
      this.a=a*b;
      this.b=a*b;
      return this.a+this.b;
	}
	public  static void function1(float f1,float f2)
	{
		Example e1=new Example();
		f1=f1+e1.function((int)f1,3);
		f2=f1+f2;
		l1=(long)(f1+f2);
		l2=(long)(f1*f2);
	}
	public static void main(String[] args) 
		
	
	{
		Example e=new Example();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  values");
		e.a=sc.nextInt();
		e.b=sc.nextInt();
		int m=e.functionOne(e.a);
		e.functionOne(m);
		System.out.println(e.a);
		System.out.println(e.b);
		System.out.println(l1);
		System.out.println(l2);
		
		
		
		
		
	}
	
}
	



