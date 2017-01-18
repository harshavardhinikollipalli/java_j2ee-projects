<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String employeeid=(String)session.getAttribute("employeid");
session.setAttribute("empid",employeeid);
%>
<%= employeeid %>
<!-- <script>

function validate()
{
	
session.setAttribute("empid",employeeid);
/* 	RequestDispatcher requestDis=request.getRequestDispatcher("EmployeeProfileServlet.java");
	requestDis.forward(request, response); */
	
	}
</script>


 -->
<form action="EmployeeProfileServlet" method="post">
<input type="submit" value="Profile" onclick="return validate()"/>
</form>
<form action="Update1Servlet" method="post">
<input type="submit" value="Update" onclick="return validate()"/>
</form>
<form action="advsal" method="post">
<input type="submit" value="advsal" onclick="return validate()"/>
</form>

<!-- <a href="update.jsp">Update Details</a>
<a href="advsalary.jsp">Advance Salary</a> -->
</body>
</html>