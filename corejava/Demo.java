package oops;



public class Demo {
	int x,y;
	static float f1,f2;
	public float functionOne(float f1,float f2)
	{

		Demo.f1=f1+f2;
		Demo.f2=Demo.f2+f1;
		return Demo.f2+f1;
	}
	public int functionOne(float f1)
	{
		Demo.f1=f1+f2;
		f1=Demo.f1+f1;
		return (int)f1;
		
	}
	public static Demo functionOne(int x)
	{
		Demo done=new Demo();
		done.x=done.functionOne(x+1.0f);
		f1=done.functionOne((float)x,f1);
		return done;
	}
	public static int functionOne(Demo d)
	{
		return d.x+d.y;
	}
	public static void main(String args[])
	{
		Demo done=functionOne(5);
		int k=functionOne(done);
		System.out.println(k);
		System.out.println(f1);
		System.out.println(f2);
		
		
	}
}
