package com.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.user.otp.GenerateEmployeeId;
import com.user.bean.CompanyBean;
import com.user.bean.UserBean;
import com.user.dboperations.Dboperations;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String empid=GenerateEmployeeId.getEmployeeId();
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String fathersname=request.getParameter("fathersname");
		String dob=request.getParameter("dob");
		String mobileno=request.getParameter("mobileno");
		String mobileno1=request.getParameter("mobileno1");
		String mail=request.getParameter("mail");
		String mail1=request.getParameter("mail1");
		String message=request.getParameter("message");
		String message1=request.getParameter("message1");
		String occupation=request.getParameter("occupation");
		String exp1=request.getParameter("exp");
		String name=request.getParameter("name");
		String period=request.getParameter("period");
		String doj=request.getParameter("doj");
		String currentctc=request.getParameter("currentctc");
		String ads=request.getParameter("ads");
		String adsd=request.getParameter("adsd");
		String adst=request.getParameter("adst");
		String designation=request.getParameter("designation");
		String technology=request.getParameter("technology");
		String pastctc=request.getParameter("pastctc");
		String phd=request.getParameter("phd");	
		
		double cctc,advs,pctc;
		int period1,exp;
		try
		{
		
		cctc=Double.parseDouble(currentctc);
		advs=Double.parseDouble(ads);
		pctc=Double.parseDouble(pastctc);
		period1=Integer.parseInt(period);
		exp=Integer.parseInt(exp1);
		
		}
		catch(Exception e)
		{
			
			cctc=0;
			advs=0;
			pctc=0;
		   period1=0;
		   exp=0;
		}
		
		UserBean employeeBean=new UserBean();
		employeeBean.setEmpid(empid);
		employeeBean.setFirstname(firstname);
		employeeBean.setLastname(lastname);
		employeeBean.setDob(dob);
		employeeBean.setMobileno(mobileno);
		employeeBean.setAlternatemob(mobileno1);
		employeeBean.setFathername(fathersname);
		employeeBean.setEmail(mail);
		employeeBean.setAlternatemail(mail1);
		employeeBean.setPermanantadd(message1);
		employeeBean.setPresentadd(message);
		employeeBean.setOccupation(occupation);
		CompanyBean cmpBean=new CompanyBean();
		cmpBean.setEmpid(empid);
		cmpBean.setYearsofexp(exp);
		cmpBean.setPastcmpname(name);
		cmpBean.setPastcmpperiod(period1);
		cmpBean.setDateofjoining(doj);
		cmpBean.setCurrentctc(cctc);
		cmpBean.setAdvsal(advs);
		cmpBean.setAdvsaldate(adsd);
		cmpBean.setAdvsalterms(adst);
		cmpBean.setDesignation(designation);
		cmpBean.setTechnology(technology);
		cmpBean.setPasthikedetails(phd);
		cmpBean.setPastctc(pctc);
		Dboperations dao=new Dboperations();
		int result=dao.empReg(employeeBean);
		int result1=dao.cmpReg(cmpBean);
		
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
		
		
	}
	

}
