package cricket;
import java.util.*;

	class  OversException extends Exception
	{
	 public String toString()
		{
			return"match reduced 40 overs should not enter morethan 40";
			}	
	 }
	class  OversException5 extends Exception
	{
	  public String toString()
		{
			return"match reduced 20 oversshould not enter morethan 20";
				
				}	
	  }
	class  OversException6 extends Exception
		{
			public String toString()
				{
				 return"match reduced 50 overs should not enter morethan 50";
				}	
		}
	public class Cricketup
			{
			static Cricketup sc=new Cricketup();
		    static Scanner input=new Scanner(System.in);
		    public int Totalscore(float overs, float runrate)
		{
		 int Tscore = (int) (overs*runrate);
	    	return  Tscore;
			}
	 public void condition(float runrate,int sr)
		{
			if(runrate>6.0)
			    {
			        int	wickets = 7;
			        System.out.println("india total score:"+sr+"/"+wickets);
				 }
				else
			        {
							int wickets=9;
							System.out.println("india total score:"+sr+"/"+wickets);
						}
					}
					
	 public int Ts1(float overs1, float runrate1)
					{	
					 int Ts = (int) (overs1*runrate1);
					return  Ts;
					}
					public void condition2(float runrate1,int rate)
					{	
					if(runrate1>=6.0)
					{
					int	wickets = 7;
					System.out.println("Aus total score:"+rate+"/"+wickets);
					}
					else
						{
							 int wickets=10;
							System.out.println("Aus total score:"+rate+"/"+wickets);
						}
					}
					
					public void result(int sr,int rate)
					{
						int Result;
						if(sr>rate)
						{
							Result=sr-rate;
							
							System.out.println("INDIA WON BY :"+Result);
						}
						else
						{
							Result=rate-sr;
							System.out.println("AUSTRALIA WON BY :"+Result);
						}
					}   
		  public void fourtyovers(String name, String name2) throws Exception
	         {
		         	System.out.println("after 1 hour match start 40over:");
					System.out.println("Match start between:"+name+ " "+"vs"+" "+name2);
					System.out.println("enter the overs played by"+name);
					float overs=input.nextFloat();
					if(overs<=40)
					{
						System.out.println("Enter the run rate:");		
					}
					else
					{
						throw new OversException();
					}
					float runrate=input.nextFloat();
					int sr=	sc.Totalscore(overs,runrate);
						sc.condition(runrate, sr);
						sc.fourtysecinn(name2,sr);
				}
	 public void fourtysecinn(String name2,int sr) throws Exception
		  {
			    System.out.println("======================================");
				System.out.println("welcome to secondinning match");
				System.out.println("===========================================");
				System.out.println("enter the overs played by AUStralia");
				
				float overs1=input.nextFloat();
				if(overs1<=40)
				  {
					System.out.println("Enter the run rate:");
				}
				else
				{
					throw new OversException();
				}
					float runrate1=input.nextFloat();
				int rate=sc.Ts1(overs1,runrate1);
					sc.condition2(runrate1,rate);
					sc.result(sr, rate);
				
				}
		  public void twentysecinn(String name2,int sr) throws Exception
		  {
			  System.out.println("======================================");
				System.out.println("welcome to secondinning match");
				System.out.println("===========================================");
				System.out.println("enter the overs played by AUStralia");
				
				float overs1=input.nextFloat();
				if(overs1<=20)
				{

					System.out.println("Enter the run rate:");
				}
				else
				{
					throw new OversException5();
				}
					float runrate1=input.nextFloat();
				int rate=sc.Ts1(overs1,runrate1);
					sc.condition2(runrate1,rate);
					sc.result(sr, rate);
				
		       }
	public void fiftyovers(String name,String name2) throws Exception
				{
					System.out.println("==========================================");
					System.out.println("welcome to One Day International(ODI)match");
					System.out.println("==========================================");
					System.out.println("Match start between:"+name+ " "+"vs"+" "+name2);
					System.out.println("enter the overs played by india");

					float overs=input.nextFloat();
					if(overs<=50)
					{
						System.out.println("Enter the run rate:");		
					}
					else
					{
						throw new OversException6();				
						}
					    float runrate=input.nextFloat();
					    int sr=	sc.Totalscore(overs,runrate);
						sc.condition(runrate, sr);
			                                                                                  //2nd innings start
			     	System.out.println("======================================");
					System.out.println("welcome to secondinning match");
					System.out.println("===========================================");
					System.out.println("enter the overs played by AUStralia");
					float overs1=input.nextFloat();
				        System.out.println("Enter the run rate:");
						float runrate1=input.nextFloat();
					    int rate=sc.Ts1(overs1,runrate1);
						sc.condition2(runrate1,rate);
						sc.result(sr, rate);
					}	
	public void overs(String name,String name1) throws Exception
				{
					System.out.println("STILL RAINNING");
					System.out.println("1.RAINY");
					System.out.println("2.NO RAIN");
					System.out.println("Enter your choice");
					int choice=input.nextInt(); 
					
					if(choice==1)
					{
						sc.twentyovers(name,name1);	
					}
					else
					{
						sc.fourtyovers(name,name1);
						
					}	
				}	
				
	public void twentyovers(String name,String name2) throws Exception
				{
					System.out.println("AFTER 3HOUR REDUCED TO 20OVERS");
					System.out.println("Match start between:"+name+ " "+"vs"+" "+name2);
					System.out.println("enter the overs played by"+name);
					float overs=input.nextFloat();
					if(overs<=20)
					{
						System.out.println("Enter the run rate:");		
					}
					else
					{
						throw new OversException5();
					}
					    float runrate=input.nextFloat();
					    int sr=	sc.Totalscore(overs,runrate);
						sc.condition(runrate, sr);
						sc.twentysecinn(name2,sr);
				}
	public static void main(String[]args) throws Exception
		{
			Scanner input=new Scanner(System.in);
			System.out.println("======================================");
			System.out.println("welcome to One Day International(ODI)match");
			System.out.println("=======================================");
			System.out.println("ENTER THE TEAM ONE:");
			String name=input.nextLine();
			System.out.println("ENTER THE TEAM TWO:");
			String name2=input.nextLine();
			System.out.println("Match start between:"+name+ " "+"vs"+" "+name2);
			System.out.println("====================");
			System.out.println("WEATHER REPORT");
			System.out.println("====================");
			System.out.println("1.RAINY");
			System.out.println("2.NO RAIN");
			System.out.println("Enter your choice");
			int choice=input.nextInt(); 
			if(choice==1)
			{
				sc.overs(name,name2);	
			}
			else
			{
				sc.fiftyovers(name,name2);
			}	
		
		}







}
