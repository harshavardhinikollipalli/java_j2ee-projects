<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="insert.js">
/* function validation()
{
var employeeId=document.getElementById("employeeid").value;
if(empid==" "||empid==null)
	{
	//alert("enter employeeid");
	document.getElementById(employeeId).innerHTML="please enter id";
	return false;
	}
else
	
	return true;
}
function clearField()
{
	document.getElementById("error").innerHTML=" ";
} */
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert</title>
</head>
<body style="background-color:Moccasin">
<div align="center">
<h1>Employee Info</h1>

<form action="InsertServlet" method="post">

 <table>
    <tr>
     <td>Enter Employee Id: <sup id="star">*</sup> </td>
      <td><input type="text" name="employeeid" id="employeeid" onkeypress="return clearField()"/></td>
      <td> <span id="error"></span> </td>
      
    </tr>

    <tr>
      <td>Enter Employee Name:</td>
      <td><input type="text" name="employeeName" /></td>
    </tr>

    <tr>
      <td>Enter Salary:</td>
      <td><input type="number" name="employeeSalary" /></td>
    </tr>
     <tr>
      <td>Enter Location:</td>
      <td><input type="text" name="employeeLocation" /></td>
    </tr>
    <tr>
      <td>Enter Experience:</td>
      <td><input type="number" name="employeeExp" /></td>
    </tr>
    
</table>

<input type="submit" value="Submit" onclick="return validation()">
</form>
<form action="Index.jsp", method="post"/>
 <input type="submit" value="go to the home page"/>
</form>
</div>

</body>

</html>