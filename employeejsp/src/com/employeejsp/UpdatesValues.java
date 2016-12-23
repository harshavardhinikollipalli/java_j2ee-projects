package com.employeejsp;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UpdatesValues
 */
@WebServlet("/UpdatesValues")
public class UpdatesValues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatesValues() {
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
		String tempid=request.getParameter("search");
		
		DAOOperations dbo=new DAOOperations();
		
		
		ArrayList<EmployeeBean> empList=dbo.search(tempid);
		
		HttpSession session=request.getSession();
		session.setAttribute("employeeList", empList);
		RequestDispatcher requestDis=request.getRequestDispatcher("Update.jsp");
		
		requestDis.forward(request, response);
		
	}

}