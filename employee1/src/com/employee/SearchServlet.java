package com.employee;

import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
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
String searchElement=request.getParameter("id");
PrintWriter out=response.getWriter();
		
		DataBaseOperations dbo=new DataBaseOperations();
		
		ArrayList<Employee> employeeList=dbo.search(searchElement);
		
		Employee employeebean=null;
		HttpSession session=request.getSession();
		Object obj=session.getAttribute("employeeList");
		Iterator iterator=employeeList.iterator();
		while(iterator.hasNext())
		{
			employeebean=(Employee)iterator.next();
			
	employeebean.getEmployeeId();	
	employeebean.getEmployeeSlary() ;
	employeebean.getEmployeeLoc();
	employeebean.getEmployeeExp(); 
			
			
		}
		session.removeAttribute("employeeList");
		
		
	}

}
