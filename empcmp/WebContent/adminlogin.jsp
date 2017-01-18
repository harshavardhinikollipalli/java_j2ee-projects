 <%@page import="java.util.Iterator"%>
<%@page import="com.user.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AdminServlet" method="post">
Adminname:<input type="text" name="name"/>
Adminpassword:<input type="password" name="password"/>
<input type="submit" value="login"/>

</form>
</body>
</html>