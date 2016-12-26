<%@page import="java.util.Iterator"%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.employeejsp.EmployeeBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.employeejsp.DAOOperations"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>





<%
String updateVariable=request.getParameter("updateRes");

if(updateVariable!=null)
{
	
	DAOOperations dao=new DAOOperations();
	ArrayList<EmployeeBean> employeeArray=dao.search(updateVariable);
	
	if(employeeArray!=null)
	{
		EmployeeBean employeeBean=null;
		Iterator<EmployeeBean> iteratore=employeeArray.iterator();
		 while(iteratore.hasNext())
		 {
			 employeeBean=(EmployeeBean)iteratore.next();
		 
		 
		if(employeeBean!=null)
		{
			%>
			<form  action="UpdateServlet" method="post">
			<table>
			
			
				<tr>
		
<td>Employee Id:<br><input type="text" value="<%= employeeBean.getEmployeeId() %>" name="eid" readonly/></td>
<td>Employee Name:<input type="text" value="<%= employeeBean.getEmployeeName()  %>" name="ename"/></td>
<td>Employee Salary:<input type="text" value="<%= employeeBean.getEmployeeSlary() %>" name="esal"/></td>
<td>Employee Exp:<input type="text" value="<%= employeeBean.getEmployeeExp() %>" name="eexp"/></td>
<td>Employee Location:<input type="text" value="<%= employeeBean.getEmployeeLoc() %>" name="eloc"/></td>


		</tr>
			
			<% 
		}
		
		 }
	}
		else 
		{
			out.println("Id Not Found");
		}
		
	}

	else
	{
		out.println("No Data Fuond");
	}
	


%>
</table>
<input type="submit" value="submit">
</form>
</div>

</body>
</html>