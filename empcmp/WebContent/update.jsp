 <%@page import="java.util.Iterator"%>
<%@page import="com.user.bean.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Employee Details</title>
</head>
<body align="center">

<div align="center">
<h2>View </h2>
</div>
<form action="Update2Servlet" method="post"> 


<%
Object obj=session.getAttribute("employeelist");

if(obj!=null)
{
	
	ArrayList<UserBean> employeeList=(ArrayList)obj;
	Iterator iterator=employeeList.iterator();
	UserBean employeebean=null;
	while(iterator.hasNext())
	{
		employeebean=(UserBean)iterator.next();
		%>
	
<table align="center">

<tr>
<td>Employee Id:</td>
<td><input type="text" value="<%= employeebean.getEmpid() %>" name="eid" readonly/></td>
</tr>

<tr>
<td>Employee FirstName:</td>
<td><input type="text" value="<%= employeebean.getFirstname()%>" name="firstname" /></td>
</tr>

<tr>
<td>Employee Last Name:</td>
<td><input type="text" value="<%= employeebean.getLastname()%>" name="lastname" /></td>
</tr>

<tr>
<td>Employee Dob:</td>
<td><input type="text" value="<%= employeebean.getDob()%>" name="dob" /></td>
</tr>

<tr><td>Employee mobileno:</td>
<td><input type="text" value="<%= employeebean.getMobileno()%>" name="mobileno" /></td>
</tr>

<tr><td>Employee mail:</td>
<td><input type="text" value="<%= employeebean.getEmail()%>" name="email" /></td>
</tr>

<tr><td>Employee alternate mail:</td>
<td><input type="text" value="<%= employeebean.getAlternatemail()%>" name="alternatemail" /></td>
</tr>


<tr><td>Employee alternate mob:</td>
<td><input type="text" value="<%= employeebean.getAlternatemob()%>" name="alternatemob" /></td>
</tr>

<tr><td>Employee presentadd:</td>
<td><input type="text" value="<%= employeebean.getPresentadd()%>" name="presentadd" /></td>
</tr>

<tr><td>Employee permanantadd:</td>
<td><input type="text" value="<%= employeebean.getPermanantadd()%>" name="permanantadd" /></td>
</tr>

<tr><td>Employee fathername:</td>
<td><input type="text" value="<%= employeebean.getFathername()%>" name="fathername" /></td>
</tr>

<tr><td>Employee occupation:</td>
<td><input type="text" value="<%= employeebean.getOccupation()%>" name="occupation" /></td>
</tr>
</table>
<%
	}
	session.removeAttribute("employeeList");
}
else
{
	out.print("data");
}
%>
<input type="submit" value="update"/>
</form>
</body>
</html>