package com.employeejsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class searchservlet
 */
@WebServlet("/searchservlet")
public class searchservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchservlet() {
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
		String searchElement=request.getParameter("dropdwn");

		DAOOperations dao=new DAOOperations();
		if(searchElement.equals("id"))
		{
			RequestDispatcher requestDis=request.getRequestDispatcher("Searchid.jsp");
			
			requestDis.forward(request, response);
		}
		else if(searchElement.equals("name"))
		{
RequestDispatcher requestDis=request.getRequestDispatcher("searchname.jsp");
			
			requestDis.forward(request, response);
		}
		else if(searchElement.equals("sal"))
		{
RequestDispatcher requestDis=request.getRequestDispatcher("searchsal.jsp");
			
			requestDis.forward(request, response);
		}
		
	}

}
