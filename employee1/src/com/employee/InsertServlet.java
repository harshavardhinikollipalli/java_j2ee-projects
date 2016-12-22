package com.employee;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.employee.MyConnection;


/**
 * Servlet implementation class Employee
 */
//@WebServlet("/Employee")
public class InsertServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
      
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
		String eid=request.getParameter("id");
		String ename=request.getParameter("name");
		String esal=request.getParameter("sal");
		String eloc=request.getParameter("loc");
		String eexp=request.getParameter("exp");
		String eloan=request.getParameter("loan");
		double salary;
		int exp;
		int loan;
		try
		{
			salary=Double.parseDouble(esal);
			exp=Integer.parseInt(eexp);
			loan=Integer.parseInt(eloan);
		}
		catch(Exception m)
		{
			salary=0;
			exp=0;
			loan=0;
		}
		e.setEmployeeId(eid);
		e.setEmployeeName(ename);
		e.setEmployeeSlary(salary);
		e.setEmployeeLoc(eloc);
		e.setEmployeeExp(exp);
		e.setEmployeeLoan(loan);
		DataBaseOperations dbo=new DataBaseOperations();
		dbo.insertData(e);
		
		out.print("Successfully Registered");	
		out.print("<html><body>");
		out.print("<form action='employee.html' "+ ">");
		out.print("<input type='submit' value='register'>");
		out.print("</form></body></html>");
		
		
	
	}
	}


