package com.employeejsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class SearchServlet
 */
//@WebServlet("/SearchServlet")
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
String searchElement=request.getParameter("searchElement");


PrintWriter out=response.getWriter();
		DAOOperations dao=new DAOOperations();
		EmployeeBean e=new EmployeeBean();
		e.setEmployeeId(searchElement);
		String name=searchElement;
		e.setEmployeeName(name);
		double sal=Double.parseDouble(searchElement);
		
		e.setEmployeeSlary(sal);
		if(e.getEmployeeId()==searchElement)
		{
		
		ArrayList<EmployeeBean> empList=dao.search(searchElement);
	
		
		HttpSession session=request.getSession();
		session.setAttribute("employeeList", empList);
		RequestDispatcher requestDis=request.getRequestDispatcher("Search.jsp");
		
		requestDis.forward(request, response);
		
		}
		
				else if(e.getEmployeeName()==name)
		{
			ArrayList<EmployeeBean> empList=dao.searchName(name);
			
			
			HttpSession session=request.getSession();
			session.setAttribute("employeeList", empList);
			RequestDispatcher requestDis=request.getRequestDispatcher("Search.jsp");
			
			requestDis.forward(request, response);
	}
				else if(e.getEmployeeSlary()==sal)
				{
					ArrayList<EmployeeBean> empList=dao.searchSalary(sal);
					
					
					HttpSession session=request.getSession();
					session.setAttribute("employeeList", empList);
					Object obj=session.getAttribute("employeeList");
					if(obj!=null)
					{
						out.println("EmployeeId /t EmployeeName/t EmployeeSlary /t EmployeeExp");
						
						Iterator it=empList.iterator();
						EmployeeBean emp=null;
						while(it.hasNext())
						{
							emp=(EmployeeBean)it.next();
							
					emp.getEmployeeId() ;	
					emp.getEmployeeName();
					emp.getEmployeeSlary() ;
					emp.getEmployeeLoc() ;
					emp.getEmployeeExp();
					}

				}
	}
	}
}
