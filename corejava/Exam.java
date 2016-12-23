package oops;

public class Exam {
	long l1,l2;
	static double d1,d2;
	Exam(long l1,long l2)
	{
		this.l1=l1+l2;
		this.l2=l1*l2;
		
	}
Exam()
{
	this((long)d1,(long)d2);
	d1=l1;
	d2=l2;
}
public int functionOne(double d1,double d2)
{
	int k=(int)d1+(int)d2;
	return k;
}
public static double functionTwo(int i)
{
	Exam e=new Exam();
	i=i+e.functionOne(2.5,7.5);
	System.out.println(i);
	System.out.println(e.l1);
	System.out.println(e.l2);
	return 7.5;
}
public static void main(String[]args)
{
	

	d1=functionTwo(2);
	d2=d1+d2;
	Exam e=new Exam();
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(e.l1);
	System.out.println(e.l2);
	
	
}
}
