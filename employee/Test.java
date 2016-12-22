package employee;
import java.util.*;

import java.io.*;
class LoanException extends Exception
{
	public String toString(){
		return "no matching";
	}
}
 class Test implements Serializable {

	 Scanner sc=new Scanner(System.in);
	static int n;
	
		static Employee[] empArray;
		public void insert() throws Exception
		{
			Employee empBean;
			for(int i=0;i<=n-1;i++)
			{
				empBean=new Employee();
			System.out.println("enter employee id");
			empBean.setId(sc.nextInt());
			System.out.println("enter name");
			empBean.setName(sc.next());
			System.out.println("enter employee location");
			empBean.setLocation(sc.next());
			System.out.println("enter employee experience");
			empBean.setExp(sc.nextInt());
			
			System.out.println("enter employee sal");
			empBean.setSal(sc.nextLong());


			empArray[i]=empBean;
			}
			FileOutputStream fos=new FileOutputStream("D:/harsha.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(empArray);
			System.out.println("after serialize");
			
			
			
		
		}
			public void update() throws Exception{

				int tempid;
				
				FileInputStream fis=new FileInputStream("D:/harsha.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				Employee[] e1=(Employee[])ois.readObject();
				System.out.println("after deserialize");
			
				
				System.out.println("enter employee id to update");
				 tempid=sc.nextInt();
			 
			for(int i=0;i<=n-1;i++)
			{
				
				Employee emp=(Employee)empArray[i];
				if(empArray[i]==null)
					System.out.println("id is not there please enter the first");
				else if(emp.getId()==tempid)
				{
					System.out.println("enter the name to update");
					emp.setName(sc.next());
					System.out.println("enter the location to update");
					emp.setLocation(sc.next());
					System.out.println("enter the sal to update");
					emp.setSal(sc.nextInt());
					System.out.println("enter the exp to update");
					emp.setExp(sc.nextInt());
					
				
					empArray[i]=emp;
					System.out.println(i+1 +" details");
					System.out.println("Id = "+ emp.getId());
					System.out.println("Name = " +emp.getName());
					System.out.println("Location = " +emp.getLocation());
					System.out.println("exp = " +emp.getExp());
					System.out.println("sal = " +emp.getSal());
					
					
				}
				else
				{
					System.out.println("id is not present");
				}
				}
			FileOutputStream fos=new FileOutputStream("D:/harsha.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(empArray);
			System.out.println("after serialize");
		
			
			}
			public void delete() throws Exception
			{
				
				
				
					FileInputStream fis=new FileInputStream("D:/harsha.txt");
					ObjectInputStream ois=new ObjectInputStream(fis);
					Object obj=ois.readObject();
					Employee[] empArray=(Employee[])obj;
					System.out.println("after deserialize");
					System.out.println("enter id to delete");
					int m;
					 m=sc.nextInt();
					for(int i=0;i<=n-1;i++)
					{
						
						Employee emp=(Employee)empArray[i];
						if(empArray[i]==null)
						{
							System.out.println("id is not present please enter the first");
							
							
						}
						else if(emp.getId()==m)
						{
						
							emp.setId(0);
						emp.setName(null);
						emp.setLocation(null);
						emp.setLoan(0);
						emp.setEmi(0);
						emp.setSal(0);
						emp.setExp(0);
						
						empArray[i]=emp;
						System.out.println("id is deleted");
						
						}
						else if(m!=emp.getId())
							System.out.println("id is not there");
						if(emp.getId()==0)
							System.out.println("there is another chance to fill array size");
					}
					FileOutputStream fos=new FileOutputStream("D:/harsha.txt");
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(empArray);
					System.out.println("after serialize");
				
					}
					public void loan() throws Exception
					{
						FileInputStream fis=new FileInputStream("D:/harsha.txt");
						ObjectInputStream ois=new ObjectInputStream(fis);
						Employee[] empArray=(Employee[])ois.readObject();
						System.out.println("after deserialize");
					
						System.out.println("enter id for loan");
						int j=sc.nextInt();
						
						for(int i=0;i<=n-1;i++)
						{
							Employee emp=(Employee)empArray[i];
							if(empArray[i]==null)
								System.out.println("id is not present");
							if(emp.getId()!=j)
								System.out.println("the id is not there");
							else if(emp.getId()==j)
							{
							if(emp.getExp()>=2&&emp.getExp()<=3&&emp.getSal()>=240000&&emp.getSal()<=300000)
						{
								long h;
								h=emp.getSal()/2;
								System.out.println("the loan will be" +h);
								int emi=(int)(h*14)/(9*100);
								emp.setEmi(emi);
								emp.setLoan(h);
								empArray[i]=emp;
								System.out.println(i+1 +" details");
								System.out.println("Id = "+ emp.getId());
								System.out.println("Name = " +emp.getName());
								System.out.println("location = " +emp.getLocation());
								System.out.println("exp = " +emp.getExp());
								System.out.println("loan = " +emp.getLoan());
								System.out.println("emi = " +emp.getEmi());
								System.out.println("sal = " +emp.getSal());
						}
							else if(emp.getExp()>=3&&emp.getSal()>=300000)
							{
								long h;
								h=(3*emp.getSal())/4;
								System.out.println("the loan will be" +h);
								int emi=(int)(h*14)/(9*100);
								emp.setEmi(emi);
								emp.setLoan(h);
								empArray[i]=emp;
								System.out.println(i+1 +" details");
								System.out.println("Id = "+ emp.getId());
								System.out.println("Name = " +emp.getName());
								System.out.println("location = " +emp.getLocation());
								System.out.println("exp = " +emp.getExp());
								System.out.println("loan = " +emp.getLoan());
								System.out.println("emi = " +emp.getEmi());
								System.out.println("sal = " +emp.getSal());
							}
							else 
						
							{
								try
								{
								throw new LoanException();
								}catch(Exception e)
								{
									System.out.println(e);
								}
						}
						}
							 
							 
						}
						FileOutputStream fos=new FileOutputStream("D:/harsha.txt");
						ObjectOutputStream oos=new ObjectOutputStream(fos);
						oos.writeObject(empArray);
						System.out.println("after serialize");
					
					}
						public void view() throws Exception
						{
							FileInputStream fis=new FileInputStream("D:/harsha.txt");
							ObjectInputStream ois=new ObjectInputStream(fis);
							Employee[] empArray=(Employee[])ois.readObject();
							System.out.println("after deserialize");
						
							System.out.println("enter id to view");
							int k=sc.nextInt();
							for(int i=0;i<=n-1;i++)
							{
								
								Employee emp=(Employee)empArray[i];
								if(empArray[i]==null)
									System.out.println("id is not present");
								
								else if(emp.getId()==k)
								{
								 long d=emp.getSal()/12;
								 int ms=(int)(d-emp.getEmi());
								 emp.setMs(ms);
								 empArray[i]=emp;
									System.out.println(i+1 +" details");
									System.out.println("Id = "+ emp.getId());
									System.out.println("Name = " +emp.getName());
									System.out.println("location = " +emp.getLocation());
									System.out.println("exp = " +emp.getExp());
									System.out.println("loan = " +emp.getLoan());
									System.out.println("emi = " +emp.getEmi());
									System.out.println("sal = " +emp.getSal());
									System.out.println("ms = " +emp.getMs());
								
								}
								 else if(emp.getId()!=k)
									 System.out.println("id is not present");
							}
							FileOutputStream fos=new FileOutputStream("D:/harsha.txt");
							ObjectOutputStream oos=new ObjectOutputStream(fos);
							oos.writeObject(empArray);
							System.out.println("after serialize");
						
						}
						public static void main(String[] args) throws Exception
						{
							
							Scanner sc=new Scanner(System.in);
							System.out.println("enter no of employees");
							n=sc.nextInt();
							empArray=new Employee[n];
							
							Test t=new Test();
							while(true)
							{
							System.out.println("insert");
							System.out.println("update");
							System.out.println("delete");
							System.out.println("loan");
							System.out.println("view");
							
							
							System.out.println("enter your choice");
							int s=sc.nextInt();
							
		
		switch(s)
		{
		case 1:t.insert();
		
				break;
		
		
		case 2:t.update();
		break;
		case 3:t.delete();
			break;
		case 4:t.loan();
			break;
		case 5:t.view();
		break;
		case 6:System.exit(0);
		break;
		default:System.out.println("no case");
		}
							}
						}		
	}
			
		
	

		
		
	



