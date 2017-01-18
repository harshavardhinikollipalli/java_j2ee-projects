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
<td><input type="text" value="<%= employeebean.getFathername()%>" name="firstname" readonly/></td>
</tr>

<tr>
<td>Employee Last Name:</td>
<td><input type="text" value="<%= employeebean.getLastname()%>" name="lastname" readonly/></td>
</tr>

<tr>
<td>Employee Dob:</td>
<td><input type="text" value="<%= employeebean.getDob()%>" name="dob" readonly/></td>
</tr>

<tr><td>Employee mobileno:</td>
<td><input type="text" value="<%= employeebean.getMobileno()%>" name="mobileno" readonly/></td>
</tr>

<tr><td>Employee mail:</td>
<td><input type="text" value="<%= employeebean.getEmail()%>" name="email" readonly/></td>
</tr>

<tr><td>Employee alternate mail:</td>
<td><input type="text" value="<%= employeebean.getAlternatemail()%>" name="alternatemail" readonly/></td>
</tr>


<tr><td>Employee alternate mob:</td>
<td><input type="text" value="<%= employeebean.getAlternatemob()%>" name="alternatemob" readonly/></td>
</tr>

<tr><td>Employee presentadd:</td>
<td><input type="text" value="<%= employeebean.getPresentadd()%>" name="presentadd" readonly/></td>
</tr>

<tr><td>Employee permanantadd:</td>
<td><input type="text" value="<%= employeebean.getPermanantadd()%>" name="permanantadd" readonly/></td>
</tr>

<tr><td>Employee fathername:</td>
<td><input type="text" value="<%= employeebean.getFathername()%>" name="fathername" readonly/></td>
</tr>

<tr><td>Employee occupation:</td>
<td><input type="text" value="<%= employeebean.getOccupation()%>" name="occupation" readonly/></td>
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

<% 
		Object obj1=session.getAttribute("emplist");

if(obj1!=null)
{
	%>
	
	

	<%
	ArrayList<CompanyBean> employeeList1=(ArrayList)obj1;
	Iterator iterator=employeeList1.iterator();
	CompanyBean employeebean=null;
	while(iterator.hasNext())
	{
		employeebean=(CompanyBean)iterator.next();
		%>
	
<table align="center">

<tr>
<td>Employee Id:</td>
<td><input type="text" value="<%= employeebean.getEmpid() %>" name="eid" readonly/></td>
</tr>

<tr>
<td>Employee yearsofexp:</td>
<td><input type="text" value="<%= employeebean.getYearsofexp()%>" name="yearsofexp" readonly/></td>
</tr>

<tr>
<td>Employee pastcmpname:</td>
<td><input type="text" value="<%= employeebean.getPastcmpname()%>" name="pastcmpname" readonly/></td>
</tr>

<tr>
<td>Employee Pastcmpperiod:</td>
<td><input type="text" value="<%= employeebean.getPastcmpperiod()%>" name="pastcmpperiod" readonly/></td>
</tr>

<tr><td>Employee Dateofjoining:</td>
<td><input type="text" value="<%= employeebean.getDateofjoining()%>" name="dateofjoining" readonly/></td>
</tr>


<tr><td>Employee currentctc:</td>
<td><input type="text" value="<%= employeebean.getCurrentctc()%>" name="currentctc" readonly/></td>
</tr>

<tr><td>Employee advsal:</td>
<td><input type="text" value="<%= employeebean.getAdvsal()%>" name="advsal" readonly/></td>
</tr>

<tr><td>Employee advsaldate:</td>
<td><input type="text" value="<%= employeebean.getAdvsaldate()%>" name="advsaldate" readonly/></td>
</tr>

<tr><td>Employee advsalterms:</td>
<td><input type="text" value="<%= employeebean.getAdvsalterms()%>" name="advsalterms" readonly/></td>
</tr>

<tr><td>Employee designation:</td>
<td><input type="text" value="<%= employeebean.getDesignation()%>" name="designation" readonly/></td>
</tr>

<tr><td>Employee technology:</td>
<td><input type="text" value="<%= employeebean.getTechnology()%>" name="technology" readonly/></td>
</tr>

<tr><td>Employee pastctc:</td>
<td><input type="text" value="<%= employeebean.getCurrentctc()%>" name="pastctc" readonly/></td>
</tr>
	</table>
		
		<%
	
	}
	session.removeAttribute("employeeList");
	
}
	
else
	
{
	out.print("No Data");
}
%>

</body>
</html>