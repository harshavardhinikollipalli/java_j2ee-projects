package thread;

public class Threads extends Thread{
public void run()
{
	System.out.println("harshu");
	System.out.println("sekku");
	try
	{
	Thread.sleep(1000);
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
	
}
public static void main(String[]args)
{
	Threads t1=new Threads();
	Threads t2=new Threads();
	Threads t3=new Threads();
	Threads t4=new Threads();
	t1.setDaemon(false);
	System.out.println(t1.getName());
	

	t1.start();
	try
	{
	t1.join();
	}catch(Exception e)
	{
		System.out.println(e);
	}
		
	t2.start();
	try
	{
		t1.join();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	t3.start();
	t4.start();
}
}
