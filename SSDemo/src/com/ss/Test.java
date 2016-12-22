package com.ss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) throws Exception
	{
		Scanner input=new Scanner(System.in);
		Employee employeeBean=new Employee();
		DataBaseOperations dbo=new DataBaseOperations();
		while(true)
		{
		System.out.println("1.insert");
		System.out.println("2.search");
		System.out.println("3.delete");
		System.out.println("4.update");
		System.out.println("5.loan");
		System.out.println("enter your choice");
		int s=input.nextInt();
		switch(s)
		{
			
		
			case 1:    System.out.println("enter employee Id");
		employeeBean.setEmployeeId(input.nextInt());
		System.out.println("enter employee name");
		employeeBean.setEmployeeName(input.next());
		System.out.println("enter employee salary");
		employeeBean.setEmployeeSlary(input.nextDouble());
		System.out.println("enter employee exp");
		employeeBean.setEmployeeExp(input.nextInt());
		System.out.println("enter employee loc");
		employeeBean.setEmployeeLoc(input.next());
		System.out.println("enter employee Loan");
		employeeBean.setEmployeeLoan(input.nextInt());
		
		
		
		
		/*int result=dbo.insertData(employeeBean);*/
		
		int result=dbo.insertDataUsingPrepared(employeeBean);
		System.out.println(result+ " data inserted");
		break;
		
			case 2:	System.out.println("enter employee Id to search");
		int employeeId=input.nextInt();
		
		  ArrayList<Employee> listOfEmp=  dbo.search(employeeId);
		  Iterator<Employee> itr=listOfEmp.iterator();
		 Employee employee=null;
		 System.out.println("Id \t Name \t salary \t exp \t loc \t loan \t");
		  while(itr.hasNext())
		  {
			  employee=(Employee)itr.next();
			  
			  System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeSlary()+"\t"+employee.getEmployeeExp()+"\t"+employee.getEmployeeLoc()+"\t"+employee.getEmployeeLoan());
		  }
		  break;
		  
			case 3:  System.out.println("enter employee Id to delete");
			int empId=input.nextInt();
			dbo.delete(empId);
			break;
			
			  
			case 4:	  System.out.println("enter employee Id to update");
				int eId=input.nextInt();
				
				System.out.println("enter empname to update");
				String empName=input.next();
				System.out.println("enter sal to update");
				double empSalary=input.nextDouble();
				System.out.println("enter exp to update");
				int empExp=input.nextInt();
				System.out.println("enter loc to update");
				String empLoc=input.next();
				System.out.println("enter loan to update");
				int empLoan=input.nextInt();
				dbo.update(eId,empName,empSalary,empExp,empLoc,empLoan);
				
					break;

			case 5:	System.out.println("enter employee Id to apply for loan");
	int Id=input.nextInt();
	int eLoan=0;;
	dbo.loan(eLoan,Id);
	break;
		}          
	}
	}
}
