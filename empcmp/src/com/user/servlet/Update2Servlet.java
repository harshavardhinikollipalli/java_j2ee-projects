package com.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.bean.UserBean;
import com.user.mail.SendMailOtp;
import com.user.mail.UpdateMail;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/Update2Servlet")
public class Update2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update2Servlet() {
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
		String eid=request.getParameter("eid");
		String fs=request.getParameter("firstname");
		String ls=request.getParameter("lastname");
		String dob=request.getParameter("dob");
		String mob=request.getParameter("mobileno");
		String mail=request.getParameter("email");
		String altmob=request.getParameter("alternatemob");
		String altmail=request.getParameter("alternatemail");
		
		String presentadd=request.getParameter("presentadd");
		String permanantadd=request.getParameter("permanantadd");
		String fas=request.getParameter("fathername");
		String occ=request.getParameter("occupation");
		UserBean ubean=new UserBean();
		ubean.setEmpid(eid);
		ubean.setFirstname(fs);
		ubean.setLastname(ls);
		ubean.setDob(dob);
		ubean.setMobileno(mob);
		ubean.setEmail(mail);
		ubean.setAlternatemob(altmob);
		ubean.setAlternatemail(altmail);
		ubean.setPresentadd(presentadd);
		ubean.setPermanantadd(permanantadd);
		ubean.setFathername(fas);
		try
		{
			UpdateMail.sendEmail(ubean);
			
			session.setAttribute("userbean",ubean);
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
