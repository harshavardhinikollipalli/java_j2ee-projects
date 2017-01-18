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

import com.user.bean.CompanyBean;
import com.user.bean.UserBean;
import com.user.dboperations.Dboperations;

/**
 * Servlet implementation class Update1Servlet
 */
@WebServlet("/Update1Servlet")
public class Update1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update1Servlet() {
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
		HttpSession session=request.getSession();
		String employeeid=(String)session.getAttribute("empid");
		PrintWriter out=response.getWriter();
		 if(employeeid!=null)
		 {
			 ArrayList<UserBean> emplist=new ArrayList<UserBean>();
			 
			 Dboperations dbo=new Dboperations();
			 emplist=dbo.userprofile(employeeid);
			 session.setAttribute("employeelist", emplist);
			 
			 
			 RequestDispatcher ref1=request.getRequestDispatcher("update.jsp");
			 ref1.forward(request, response);
			
			 
			 
		 }
		 else
		 {
			 RequestDispatcher ref=request.getRequestDispatcher("employeeprofile.jsp");
			 ref.include(request, response);
			 out.print("Wrong");
		 }
		
	}

}
