package com.user.dboperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.user.bean.UserBean;
import com.user.bean.CompanyBean;
public class Dboperations {
	Connection connection=null;
	PreparedStatement pst=null;
	ResultSet resultset=null;
	public Dboperations()
	{
		connection=MyConnection.getInstance().connection;
	}
	public ArrayList admin()
	{
		ArrayList employeeList=new ArrayList();
		
		String query="select name,email,password from admin";
		
		try {
			pst=connection.prepareStatement(query);
			
			resultset=pst.executeQuery();
			
			UserBean ubean=null;
			while(resultset.next())
			{
				ubean=new UserBean();
				ubean.setAdminName(resultset.getString(1));
				ubean.setAdminEmail(resultset.getString(2));
				ubean.setAdminPwd(resultset.getString(3));
				
				employeeList.add(ubean);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employeeList;
	}
	public int empReg(UserBean ub)
	{
		int result=0;
		
		String query="insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try
		{
			pst=connection.prepareStatement(query);
			pst.setString(1, ub.getEmpid());
			pst.setString(2, ub.getFirstname());
			pst.setString(3, ub.getLastname());
			pst.setString(4, ub.getDob());
			pst.setString(5, ub.getMobileno());
			pst.setString(6, ub.getEmail());
			pst.setString(7, ub.getAlternatemail());
			pst.setString(8, ub.getAlternatemob());
			pst.setString(9, ub.getPresentadd());
			pst.setString(10, ub.getPermanantadd());
			pst.setString(11, ub.getFathername());
			pst.setString(12, ub.getOccupation());
			result=pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	public int cmpReg(CompanyBean cb)
	{
		int result=0;
		
		String query="insert into company values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try
		{
			pst=connection.prepareStatement(query);
			pst.setString(1, cb.getEmpid());
			pst.setInt(2, cb.getYearsofexp());
			pst.setString(3, cb.getPastcmpname());
			pst.setInt(4, cb.getPastcmpperiod());
			pst.setString(5, cb.getDateofjoining());
			pst.setDouble(6, cb.getCurrentctc());
			pst.setDouble(7, cb.getAdvsal());
			pst.setString(8, cb.getAdvsaldate());
			pst.setString(9, cb.getAdvsalterms());
			pst.setString(10, cb.getDesignation());
			pst.setString(11, cb.getTechnology());
			pst.setDouble(12, cb.getPastctc());
			pst.setString(13, cb.getPasthikedetails());
			result=pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	public ArrayList<UserBean> loginsearch(String employeeid)
	{
		
		ArrayList<UserBean> empref=new ArrayList<UserBean>();
		
String query="select empid,dob,email from employee where empid=?";
		
		try {
			pst=connection.prepareStatement(query);
			pst.setString(1, employeeid);
			
			resultset=pst.executeQuery();
			
			UserBean empBean=null;
			while(resultset.next())
			{
				empBean=new UserBean();
				empBean.setEmpid(resultset.getString(1));
				empBean.setDob(resultset.getString(2));
				empBean.setEmail(resultset.getString(3));
				
			
				empref.add(empBean);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return empref;
		
	}
	public ArrayList<UserBean> userprofile(String employeeid)
	{
		
		ArrayList<UserBean> empref=new ArrayList<UserBean>();
		
		
		String query="select * from employee where empid=?";

		
		try {
			pst=connection.prepareStatement(query);
		
			pst.setString(1, employeeid);
			
			resultset=pst.executeQuery();
			
			UserBean empBean=null;
			while(resultset.next())
			{
				empBean=new UserBean();
				empBean.setEmpid(resultset.getString(1));
				empBean.setFirstname(resultset.getString(2));
				empBean.setLastname(resultset.getString(3));
				empBean.setDob(resultset.getString(4));
				empBean.setMobileno(resultset.getString(5));
				empBean.setEmail(resultset.getString(6));
				empBean.setAlternatemob(resultset.getString(7));
				empBean.setAlternatemail(resultset.getString(8));
				empBean.setPresentadd(resultset.getString(9));
				empBean.setPermanantadd(resultset.getString(10));
				empBean.setFathername(resultset.getString(11));
				empBean.setOccupation(resultset.getString(12));
				empref.add(empBean);
		
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return empref;
		
		
	}
	public ArrayList<CompanyBean> userprofile1(String employeeid)
	{
		
		
		ArrayList<CompanyBean> empref1=new ArrayList<CompanyBean>();
		
		
		String query="select * from company where empid=?";
		
		try {
			
			pst=connection.prepareStatement(query);
			pst.setString(1, employeeid);
			
			resultset=pst.executeQuery();
			
			
			CompanyBean empBean1=null;
			while(resultset.next())
			{
				empBean1=new CompanyBean();
				empBean1.setEmpid(resultset.getString(1));
				empBean1.setYearsofexp(resultset.getInt(2));
				empBean1.setPastcmpname(resultset.getString(3));
				empBean1.setPastcmpperiod(resultset.getInt(4));
				empBean1.setDateofjoining(resultset.getString(5));
				empBean1.setCurrentctc(resultset.getDouble(6));
				empBean1.setAdvsal(resultset.getDouble(7));

				empBean1.setAdvsaldate(resultset.getString(8));
				empBean1.setAdvsalterms(resultset.getString(9));
				empBean1.setDesignation(resultset.getString(10));
				empBean1.setTechnology(resultset.getString(11));
				empBean1.setPastctc(resultset.getDouble(12));
				empBean1.setPasthikedetails(resultset.getString(13));
				
				empref1.add(empBean1);	
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return empref1;
		
	}
	
	public int update(UserBean employeeBean)
	{
		int x=0;
		String query="update employee set firstname=?,lastname=?,dob=?,mobileno=?,email=?,alternatemail=?,presentadd=?,permanantadd=?,fathername=?,occupation=? where empid=?";
	try
	{
		pst=connection.prepareStatement(query);
		
		pst.setString(1,employeeBean.getFirstname());
		pst.setString(2,employeeBean.getLastname());
		pst.setString(3,employeeBean.getDob());
		pst.setString(4,employeeBean.getMobileno());
		pst.setString(5,employeeBean.getEmail());
			pst.setString(6,employeeBean.getAlternatemail());
		
		//pst.setString(7,employeeBean.getAlternatemob());
		pst.setString(7,employeeBean.getPresentadd());
		pst.setString(8,employeeBean.getPermanantadd());
		pst.setString(9,employeeBean.getFathername());
		pst.setString(10,employeeBean.getOccupation());
		pst.setString(11,employeeBean.getEmpid());
		
		 x=	pst.executeUpdate();
		
    System.out.println("updated rows:"+ x);
		
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	return x;
	
	}
}
