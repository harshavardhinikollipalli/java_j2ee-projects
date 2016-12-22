package employeelist;



import java.util.*;


class LoanException extends Exception
{
	public String toString(){
		return "no matching";
	}
}





public class Test {
	 Scanner sc=new Scanner(System.in);
		
		
		 ArrayList<EmployeeList> alemp=new ArrayList<EmployeeList>();
			public void insert() throws Exception
			{
				
				
					
					EmployeeList emp=new EmployeeList();
				System.out.println("enter employee id");
                 emp.setId(sc.nextInt());
				
				System.out.println("enter name");
				emp.setName(sc.next());
				System.out.println("enter employee location");
				emp.setLocation(sc.next());

				
				System.out.println("enter employee experience");
				emp.setExp(sc.nextInt());
				
				System.out.println("enter employee sal");
				emp.setSal(sc.nextLong());
			
				
				
								
								
				
				alemp.add(emp);
				
				Iterator il=alemp.iterator();
				while(il.hasNext())
				{
					EmployeeList e=(EmployeeList)il.next();
					System.out.println(e.getId());
					System.out.println(e.getName());
					System.out.println(e.getExp());
					System.out.println(e.getLocation());
					System.out.println(e.getSal());
					System.out.println(e.getLoan());
					
				}
				
				}	
			

				public void delete() throws Exception
				{
					
					
					
						System.out.println("enter id to delete");
						int m;
						 m=sc.nextInt();
						 
						
							
							Iterator it=alemp.iterator();
							while(it.hasNext())
							{
							
							EmployeeList e=(EmployeeList)it.next();
							
							 if(e.getId()==m)
							{
							
							it.remove();
							System.out.println("id is deleted");
							
							}
							 else if(e.getId()!=m)
								 System.out.println("id is not present in the list");
						
							}
						
							
				
				
				
				
				
				
			
			}
				public void update() throws Exception{

					int tempid;
					
					
					
					System.out.println("enter employee id to update");
					 tempid=sc.nextInt();
				 
			
					Iterator it=alemp.iterator();
					while(it.hasNext())
					{
					
					EmployeeList e=(EmployeeList)it.next();
					
					
					if(e.getId()==tempid)
					{
						int n=alemp.indexOf(e);
						System.out.println("enter the name to update");
						e.setName(sc.next());
						System.out.println("enter the location to update");
						e.setLocation(sc.next());
						System.out.println("enter the sal to update");
						e.setSal(sc.nextInt());
						System.out.println("enter the exp to update");
						e.setExp(sc.nextInt());
						
						alemp.set(n,e);
						
						
							System.out.println(e.getName());
							System.out.println(e.getExp());
							System.out.println(e.getLocation());
							System.out.println(e.getSal());
						
					}
					
					 else if(e.getId()!=tempid)
						 System.out.println("id is not present in the list ");
					
					}
					
				}
				
			
				
				
				public void view() throws Exception
				{
					
					Iterator il=alemp.iterator();
					
					while(il.hasNext())
					{
						
						EmployeeList emp=(EmployeeList)il.next();
						
						System.out.println(emp.getId());
						System.out.println(emp.getName());
						System.out.println(emp.getExp());
						System.out.println(emp.getLocation());
						System.out.println(emp.getSal());
						System.out.println(emp.getLoan());
					
					}
				}
				public void loan() throws Exception
				{
					
					System.out.println("enter id for loan");
					int j=sc.nextInt();
					
					
						Iterator it=alemp.iterator();
						while(it.hasNext())
						{
							
							EmployeeList emp=(EmployeeList)it.next();
						if(emp.getId()==j)
						{
						if(emp.getExp()>=2&&emp.getExp()<=3&&emp.getSal()>=240000&&emp.getSal()<=300000)
					{
							long h;
							h=emp.getSal()/2;
							System.out.println("the loan will be" +h);
							int emi=(int)(h*14)/(9*100);
							emp.setEmi(emi);
							emp.setLoan(h);
							
							
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
						else if(emp.getId()!=j)
							System.out.println("id is not there");
					}
					
				
				}
				
							public static void main(String[] args) throws Exception
							{
								
								Scanner sc=new Scanner(System.in);
							
								
								
								Test t=new Test();
								while(true)
								{
								
								System.out.println("1.insert");
								System.out.println("2.update");
								System.out.println("3.delete");
								
								System.out.println("4.view");
								System.out.println("5.loan");
								
								
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
			case 4:t.view();
			break;
			case 5:t.loan();
			break;
			
			}	
								}
							}
}
