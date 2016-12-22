package com.employeejsp;

import java.sql.*;

import java.util.ArrayList;
import java.util.Iterator;



public class DAOOperations {
	Connection connection;
	PreparedStatement pst;
	ResultSet resultSet;

	public DAOOperations() {
		connection = MyConnection.getInstance().connec;
	}

	public int insertData(EmployeeBean employeeBean) {
		int result = 0;
		String query = "insert into employee values(?,?,?,?,?,?)";

		try {
			pst = connection.prepareStatement(query);
			pst.setString(1, employeeBean.getEmployeeId());
			pst.setString(2, employeeBean.getEmployeeName());
			pst.setDouble(3, employeeBean.getEmployeeSlary());
			pst.setString(4, employeeBean.getEmployeeLoc());
			pst.setFloat(5, employeeBean.getEmployeeExp());
			pst.setInt(6, employeeBean.getEmployeeLoan());


			result = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;

	}
	
	
	public ArrayList<EmployeeBean> search(String searchElement)
	{
		ArrayList<EmployeeBean> employeeList=new ArrayList<EmployeeBean>();
		
		String query="select eid,ename,esal,eexp from employee where eid=?";
		
		try {
			pst=connection.prepareStatement(query);
			pst.setString(1, searchElement);
			
			resultSet=pst.executeQuery();
			
			EmployeeBean empBean=null;
			while(resultSet.next())
			{
				empBean=new EmployeeBean();
				empBean.setEmployeeId(resultSet.getString(1));
				empBean.setEmployeeName(resultSet.getString(2));
				empBean.setEmployeeSlary(resultSet.getDouble(3));
				empBean.setEmployeeExp(resultSet.getInt(4));
				employeeList.add(empBean);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employeeList;
	}
	public ArrayList<EmployeeBean> searchName(String searchElement)
	{
		ArrayList<EmployeeBean> employeeList=new ArrayList<EmployeeBean>();
		
		String query="select eid,ename,esal,eexp from employee where ename=?";
		
		try {
			pst=connection.prepareStatement(query);
			pst.setString(1, searchElement);
			
			resultSet=pst.executeQuery();
			
			EmployeeBean empBean=null;
			while(resultSet.next())
			{
				empBean=new EmployeeBean();
				empBean.setEmployeeId(resultSet.getString(1));
				empBean.setEmployeeName(resultSet.getString(2));
				empBean.setEmployeeSlary(resultSet.getDouble(3));
				empBean.setEmployeeExp(resultSet.getInt(4));
				employeeList.add(empBean);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employeeList;
	}
	public ArrayList<EmployeeBean> searchSalary(double searchElement)
	{
		ArrayList<EmployeeBean> employeeList=new ArrayList<EmployeeBean>();
		
		String query="select eid,ename,esal,eexp from employee where esal=?";
		
		try {
			pst=connection.prepareStatement(query);
			pst.setDouble(1, searchElement);
			
			resultSet=pst.executeQuery();
			
			EmployeeBean empBean=null;
			while(resultSet.next())
			{
				empBean=new EmployeeBean();
				empBean.setEmployeeId(resultSet.getString(1));
				empBean.setEmployeeName(resultSet.getString(2));
				empBean.setEmployeeSlary(resultSet.getDouble(3));
				empBean.setEmployeeExp(resultSet.getInt(4));
				employeeList.add(empBean);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employeeList;
	}
		public int update(EmployeeBean employeeBean)
		{
			int x=0;
			String query="update employee set ename=?,esal=?,eloc=?,eexp=?,eloan=? where eid=?";
		try
		{
			pst=connection.prepareStatement(query);
			
			pst.setString(1,employeeBean.getEmployeeName());
			pst.setDouble(2,employeeBean.getEmployeeSlary());
			pst.setInt(4,employeeBean.getEmployeeExp());
			pst.setString(3,employeeBean.getEmployeeLoc());
			pst.setInt(5,employeeBean.getEmployeeLoan());
			
			pst.setString(6,employeeBean.getEmployeeId());
			
			 x=	pst.executeUpdate();
			
	    System.out.println("updated rows:"+ x);
			
		}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		return x;
		
		}
		public int delete(String empId)
		{
			int x=0;
			String query="delete from employee where eid=?";
			
			try 
			{
				pst=connection.prepareStatement(query);
				
				pst.setString(1, empId);
				
				 x=	pst.executeUpdate();
				System.out.println("deleted rows:"+ x);

			}
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return x;
		}
	public int loan(int eLoan,String Id) throws Exception
		
		{
			int x=0;
			ArrayList<EmployeeBean> loe=search(Id);
			Iterator<EmployeeBean> itt=loe.iterator();
			EmployeeBean ee=null;
			while(itt.hasNext())
			{
			ee=(EmployeeBean)itt.next();
			
			if(ee.getEmployeeExp()>2 && ee.getEmployeeExp()<4)
			{
				eLoan=(int)ee.getEmployeeSlary()+1000;
				ee.setEmployeeLoan(eLoan);
				System.out.println("loan=" +eLoan);
				
			}
			else
			{
				eLoan=(int)ee.getEmployeeSlary()+100;
				ee.setEmployeeLoan(eLoan);
				System.out.println("not eligible for loan");
				
			}
		}
			String query="update employee set eloan=? where eid=?";

			pst=connection.prepareStatement(query);
			pst.setInt(1, eLoan);
			pst.setString(2, Id);
			x=pst.executeUpdate();
			
			System.out.println("Updated rows="+x);	
			
		return x;
}
	}
	
	
	
	
	
	
	
	
	
	
	
	

