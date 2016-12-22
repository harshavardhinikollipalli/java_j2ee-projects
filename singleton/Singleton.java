package singleton;

 class Singleton1 {
private static Singleton1 a=new Singleton1();
private Singleton1()
{
	int c,d=1;
	c=d+1;
}
public static Singleton1 getInstance()
{
	return a;
}
public void display()
{
	System.out.println("single");
}
 }
class Singleton
{
	public static void main(String[]args)
	{
		Singleton1.getInstance().display();
	}
}

