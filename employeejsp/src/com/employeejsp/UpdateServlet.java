package com.employeejsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class UpdateServlet
 */
//@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
		
		EmployeeBean e=new EmployeeBean();
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
		String eid=request.getParameter("id");
		String ename=request.getParameter("name");
		String esal=request.getParameter("sal");
		String eloc=request.getParameter("loc");
		String eexp=request.getParameter("exp");
		String eloan=request.getParameter("loan");
		double sal;
		int exp,loan;
		try
		{
			sal=Double.parseDouble(esal);
			exp=Integer.parseInt(eexp);
			loan=Integer.parseInt(eloan);
		}
		catch(Exception m)
		{
			sal=0.0;
			exp=0;loan=0;
		}
		e.setEmployeeId(eid);
		e.setEmployeeName(ename);
		e.setEmployeeSlary(sal);
		e.setEmployeeLoc(eloc);
		e.setEmployeeExp(exp);
		e.setEmployeeLoan(loan);
		
		DAOOperations dbo=new DAOOperations();
		int x=dbo.update(e);
RequestDispatcher requestDispact=request.getRequestDispatcher("Success.jsp");
		
		HttpSession session=request.getSession();
		session.setAttribute("id", eid);
		
		if(x>0)
		{
			requestDispact.forward(request, response);
		}
		
	}

}
