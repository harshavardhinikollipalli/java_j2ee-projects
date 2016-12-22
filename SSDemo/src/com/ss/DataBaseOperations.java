package com.ss;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;
import java.util.*;
public class DataBaseOperations 
{
	Connection connection;
	java.sql.Statement statementRef;
	PreparedStatement statement;
	ResultSet resultSet;
	
	public DataBaseOperations()
	{
		connection=MyConnection.getInstance().connection;
	}
	
	/*public int insertData(Employee employee)
	{
		int result=0;
		
		String query="insert into employee values("+ employee.getEmployeeId()+','+"'"+employee.getEmployeeName()+"',"+employee.getEmployeeSlary()+");
		try {
			statementRef=connection.createStatement();
			result=statementRef.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}*/
	
	public int insertDataUsingPrepared(Employee employee)
	{
		int result=0;
		
		String query="insert into employee values(?,?,?,?,?,?)";
		
		try {
			statement=connection.prepareStatement(query);
			
			statement.setInt(1, employee.getEmployeeId());
			statement.setString(2, employee.getEmployeeName());
			statement.setDouble(3, employee.getEmployeeSlary());
		
			statement.setInt(4, employee.getEmployeeExp());
			statement.setString(5, employee.getEmployeeLoc());
			statement.setInt(6, employee.getEmployeeLoan());
			
			result=statement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
		
		
	}
	
			
	public void delete(int empId)
	{
		
		String query="delete from employee where E_Id=?";
		
		try 
		{
			statement=connection.prepareStatement(query);
			
			statement.setInt(1, empId);
			
			int x=	statement.executeUpdate();
			System.out.println("deleted rows:"+ x);

		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
		public void update(int eId,String empName,double empSalary,int empExp,String empLoc,int empLoan )
		{
			
			String query="update employee set E_Name=?,E_Salary=?,E_Exp=?,E_Loc=?,E_Loan=? where E_Id=?";
		try
		{
			statement=connection.prepareStatement(query);
			
			statement.setString(1,empName);
			statement.setDouble(2,empSalary);
			statement.setInt(3,empExp);
			statement.setString(4,empLoc);
			statement.setInt(5,empLoan);
			
			statement.setInt(6,eId);
			
			int x=	statement.executeUpdate();
			System.out.println("updated rows:"+ x);
			
		}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
	
		}
	
	
	public ArrayList<Employee> search()
	{
		ArrayList<Employee> listOfEmployee=new ArrayList<Employee>();
		
		Employee employeeRef=null;
		
		String query="select * from employee";
		
		try {
			statement=connection.prepareStatement(query);
			resultSet=statement.executeQuery();
			
			while(resultSet.next())
			{
				employeeRef=new Employee();
				employeeRef.setEmployeeId(resultSet.getInt(1));
				employeeRef.setEmployeeName(resultSet.getString(2));
				employeeRef.setEmployeeSlary(resultSet.getDouble(3));
				employeeRef.setEmployeeExp(resultSet.getInt(1));
				
				employeeRef.setEmployeeLoc(resultSet.getString(2));
				employeeRef.setEmployeeLoan(resultSet.getInt(3));
				
				listOfEmployee.add(employeeRef);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return listOfEmployee;
	}
	
	public ArrayList<Employee> search(int employeeId)
	{
		ArrayList<Employee> listOfEmployee=new ArrayList<Employee>();
		
		Employee employeeRef=null;
		
		String query="select * from employee where E_id=?";
		
		try {
			statement=connection.prepareStatement(query);
			
			statement.setInt(1, employeeId);
			
			resultSet=statement.executeQuery();
			
			while(resultSet.next())
			{
				employeeRef=new Employee();
				employeeRef.setEmployeeId(resultSet.getInt(1));
				employeeRef.setEmployeeName(resultSet.getString(2));
				employeeRef.setEmployeeSlary(resultSet.getDouble(3));
				employeeRef.setEmployeeExp(resultSet.getInt(4));
				employeeRef.setEmployeeLoc(resultSet.getString(5));
				employeeRef.setEmployeeLoan(resultSet.getInt(6));
				
				
				listOfEmployee.add(employeeRef);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return listOfEmployee;
	}
	
public void loan(int eLoan,int Id) throws Exception
	
	{
		
		ArrayList<Employee> loe=search(Id);
		Iterator<Employee> itt=loe.iterator();
		Employee ee=null;
		while(itt.hasNext())
		{
		ee=(Employee)itt.next();
		
		if(ee.getEmployeeExp()>=2 && ee.getEmployeeExp()<4)
		{
			eLoan=(int)ee.getEmployeeSlary()/2;
			ee.setEmployeeLoan(eLoan);
			System.out.println("loan=" +eLoan);
			
		}
		else
		{
			
			System.out.println("not eligible for loan");
			
		}
	}
		String query="update employee set E_Loan=? where E_Id=?";

		statement=connection.prepareStatement(query);
		statement.setDouble(1, eLoan);
		statement.setInt(2, Id);
		int x=statement.executeUpdate();
		
		System.out.println("Updated rows="+x);	
	}
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


