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
 * Servlet implementation class LoanServlet
 */
//@WebServlet("/LoanServlet")
public class LoanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoanServlet() {
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
		int x=0;
		EmployeeBean e=new EmployeeBean();
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
		String eid=request.getParameter("id");
		int eloan=0;
		DAOOperations dbo=new DAOOperations();
		try {
		 x=dbo.loan(eloan, eid);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
RequestDispatcher requestDispact=request.getRequestDispatcher("Success.jsp");
		
		HttpSession session=request.getSession();
		session.setAttribute("id", eid);
		
		
		if(x>0)
		{
			requestDispact.forward(request, response);
		}

	}
	}


