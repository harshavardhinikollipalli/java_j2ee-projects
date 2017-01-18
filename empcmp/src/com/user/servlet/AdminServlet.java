package com.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.dboperations.Dboperations;
import com.user.bean.UserBean;


/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
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
		

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String adminname=request.getParameter("name");
		String adminpwd=request.getParameter("password");
		
		RequestDispatcher ref=request.getRequestDispatcher("adminlogin.jsp");
		RequestDispatcher ref1=request.getRequestDispatcher("adminview.jsp");
		
		if(adminname.equals("harshu") && adminpwd.equals("harishijan2"))
		{
			ref1.forward(request, response);
		}
		else
		{
			
			ref.include(request, response);
			out.print("Wrong Credentials,Try Again");
		}
	}
}
