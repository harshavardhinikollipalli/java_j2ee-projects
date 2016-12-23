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
		
		ArrayList<Employee> empList=dbo.search(searchElement);
		HttpSession session=request.getSession();
		session.setAttribute("employeeList", empList);
		Object obj=session.getAttribute("employeeList");
		if(obj!=null)
		{
		out.print("EmployeeId \t EmployeeName \t EmployeeSalary \t EmployeeLoc \t EmployeeExp \t EmployeeLoan");
		ArrayList<Employee> employeeList=(ArrayList)obj;
		Iterator iterator=employeeList.iterator();
		Employee employeebean;
		while(iterator.hasNext())
		{
		employeebean=(Employee)iterator.next();
		out.println(employeebean.getEmployeeId()+"\t"+employeebean.getEmployeeName()+"\t"+employeebean.getEmployeeSlary()+"\t"+employeebean.getEmployeeLoc()+"\t"+employeebean.getEmployeeExp()+"\t"+employeebean.getEmployeeLoan());
		}
		}
		
	}

}
