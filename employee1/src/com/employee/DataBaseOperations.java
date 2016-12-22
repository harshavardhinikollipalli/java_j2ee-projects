package com.employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.employee.Employee;

public class DataBaseOperations {
	Connection connection;
	PreparedStatement pst;
	ResultSet resultSet;

	public DataBaseOperations() {
		connection = MyConnection.getInstance().connec;
	}

	public int insertData(Employee e) {
		int result = 0;
		String query = "insert into employee values(?,?,?,?,?,?)";

	try{
			
			pst = connection.prepareStatement(query);
				  
				pst.setString(1,e.getEmployeeId());  
				pst.setString(2,e.getEmployeeName());  
				pst.setDouble(3,e.getEmployeeSlary());  
				pst.setString(4,e.getEmployeeLoc()); 
				pst.setInt(5,e.getEmployeeExp()); 
				pst.setInt(6,e.getEmployeeLoan()); 
				
				int i=pst.executeUpdate();  
				
			
			}
			
			catch (SQLException ex) 
			{
			
				System.out.println(ex);
			}

		return result;

	}
	public ArrayList<Employee> search()
	{
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		
		String query="select * from employee ";
		
		try {
			pst=connection.prepareStatement(query);
			//preparedStatement.setString(1, searchElement);
			
			resultSet=pst.executeQuery();
			
			Employee empBean=null;
			while(resultSet.next())
			{
				empBean=new Employee();
				empBean.setEmployeeId(resultSet.getString(1));
				empBean.setEmployeeName(resultSet.getString(2));
				empBean.setEmployeeSlary(resultSet.getDouble(3));
				empBean.setEmployeeLoc(resultSet.getString(4));
				empBean.setEmployeeExp(resultSet.getInt(5));
				employeeList.add(empBean);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return employeeList;
	}
	public ArrayList<Employee> search(String searchElement)
	{
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		
		String query="select eid,ename,eexp,esal from employee where eid=?";
		
		try {
			pst=connection.prepareStatement(query);
			pst.setString(1, searchElement);
			
			resultSet=pst.executeQuery();
			
			Employee empBean=null;
			while(resultSet.next())
			{
				empBean=new Employee();
				empBean.setEmployeeId(resultSet.getString(1));
				empBean.setEmployeeName(resultSet.getString(2));
				
				empBean.setEmployeeExp(resultSet.getInt(3));
				empBean.setEmployeeSlary(resultSet.getDouble(4));
				employeeList.add(empBean);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return employeeList;
	}
	public void update(String eId,String empName,double empSalary,int empExp,String empLoc,int empLoan )
	{
		
		String query="update employee set ename=?,esal=?,eexp=?,eloc=?,eloan=? where eid=?";
	try
	{
		pst=connection.prepareStatement(query);
		
		pst.setString(1,empName);
		pst.setDouble(2,empSalary);
		pst.setInt(3,empExp);
		pst.setString(4,empLoc);
		pst.setInt(5,empLoan);
		
		pst.setString(6,eId);
		
		int x=	pst.executeUpdate();
		
    System.out.println("updated rows:"+ x);
		
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}
	public void delete(String empId)
	{
		
		String query="delete from employee where eid=?";
		
		try 
		{
			pst=connection.prepareStatement(query);
			
			pst.setString(1, empId);
			
			int x=	pst.executeUpdate();
			System.out.println("deleted rows:"+ x);

		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void loan(int eLoan,String Id) throws Exception
	
	{
		
		ArrayList<Employee> loe=search(Id);
		Iterator<Employee> itt=loe.iterator();
		Employee ee=null;
		while(itt.hasNext())
		{
		ee=(Employee)itt.next();
		
		if(ee.getEmployeeExp()>2 && ee.getEmployeeExp()<4)
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
		String query="update employee set eloan=? where eid=?";

		pst=connection.prepareStatement(query);
		pst.setInt(1, eLoan);
		pst.setString(2, Id);
		int x=pst.executeUpdate();
		
		System.out.println("Updated rows="+x);	
	}		
	
}
