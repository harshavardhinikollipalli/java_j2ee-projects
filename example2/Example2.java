package example2;

public class Example2 {
static int i;
static long l1,l2;
float f1,f2;
static Example2[]  ex=new Example2[2];
Example2(){
	f1=(float)l1;
	f2=(float)l2;
}
public static void fo(long l1,long l2)
{
	Example2.l1=Example2.l1+l2;
	Example2.l2=Example2.l2+l1;
	Example2 e=null;
	while(i<=1)
	{
	e=new Example2();
	ex[i]=e;
	i++;
	fo(2,5);
	}
}
public float ft(float f1,float f2)
{
	
	fo((long)f1,(long)f2);
	this.f1=this.f1+f1;
	this.f2=this.f2+f2;
	return this.f1+this.f2;
}
public static void fth(int a,int b)
{
	Example2 e=new Example2();
	e.ft(a,b);
}
public static void main(String[]args)
{
 fth(5,7);
 Example2 e=null;
 for(int i=0;i<=1;i++)
 {
	 e=(Example2)ex[i];
	 System.out.println(e.f1);
	 System.out.println(e.f2);
	 System.out.println(e.i);
	 System.out.println(l1);
	 System.out.println(l2);
 
 
 
 
 }
}
}
