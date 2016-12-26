package Emp;

import java.util.*;


	public class Test 
	{
		static Scanner sc=new Scanner(System.in);
		
		static ArrayList<Emp> a=new ArrayList<Emp>();
		

		public void insert()
		{
			System.out.println("Enter Emp Id and Name");
			a.add(new Emp(sc.nextInt(),sc.next()));
		}
		
		
		public void delete()
		{
			System.out.println("Enter Id to Delete:");
			
			int tempid=sc.nextInt();
			
			Iterator<Emp> it=a.iterator();
			
			while(it.hasNext())
			{
				Emp ee=(Emp)it.next();
				
				if((ee.eid)==(tempid))
				{
					it.remove();
				
				}
			}
			
			for(Emp ee:a)
			{
				System.out.println(ee.eid+"----"+ee.ename);
			}
			System.out.println("Present Size of the Array:"+ a.size());
		}
		
		public void update()
		
		{
			System.out.println("Enter id to Update:");
			int tempid=sc.nextInt();

			Iterator<Emp> li = a.iterator();
		
			while(li.hasNext())
			{
				Emp ee=(Emp)li.next();
				
				if((ee.eid)==(tempid))
				{
					int m=a.indexOf(ee);
					System.out.println("Enter Name to Update:");
					
					a.set(m,new Emp(sc.nextInt(),sc.next()));
				
				}
			}
			
			for(Emp ee:a)
			{
				System.out.println(ee.eid+"----"+ee.ename);
			}
			System.out.println("Present Size of the Array:"+ a.size());
		}
		
		
		public void view()
		{
			System.out.println("Enter Emp Id To View:");
			
			int tempid=sc.nextInt();
			
			for(Emp ee:a)
			{
				if(ee.eid==tempid)
				{
				System.out.println(ee.eid+"----"+ee.ename);
				}
			}
		}
		public static void main(String[] args) 
		{
			
			Test t=new Test();
			while(true)
			{
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter Your Choice:");
			System.out.println("1.Insert Emp Details");
			System.out.println("2.Update Emp Details");
			System.out.println("3.Delete Emp Details");
			//System.out.println("4.Apply For Loan");
			//System.out.println("5.Emi");
			System.out.println("6.View");
			System.out.println("7.Exit");
			
			switch(sc1.nextInt())
				{
				
					case 1:
						t.insert();
						break;
				
					case 2:
						t.update();
						break;
				
					case 3:
						t.delete();
						break;
						
					case 6:
						t.view();
						break;
				
					case 7:
						System.out.println("Thank You");
						System.exit(0);
						break;
						
					default:
						//System.out.println("Bye");
				}
			
			}
			
			
			
		}
	}


