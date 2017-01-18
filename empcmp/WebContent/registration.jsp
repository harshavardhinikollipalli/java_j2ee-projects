<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="registration.js">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink"/>
<form action="RegServlet" method="post">
<pre>
<table>
<tr>
<td>Firstname:<sup id="star">*</sup> </td>
<td><input type="text" name="firstname" id="firstname" onkeypress="return clearField()"/> </td>    
<td><span id="error"></span></td>
</tr> 

<tr>
 <td>Lastname:<sup id="star">*</sup> </td>
 <td><input type="text" name="lastname" id="lastname" onkeypress="return clearField()"/></td>
 <td><span id="error"></span> </td>
 </tr>
 <tr>
<td>fathersname:<sup id="star">*</sup></td>
<td><input type="text" name="fathersname" id="fathersname" onkeypress="return clearField()"/></td>
<td><span id="error"></span></td> 
</tr>

<tr>
<td>dateofbirth:<sup id="star">*</sup></td>
<td><input type="text" name="dob" id="dob" onkeypress="return clearField()"/></td>
<td><span id="error"></span></td>
</tr> 

<tr>
<td>mobile no: <sup id="star">*</sup></td>
<td><input type="text" name="mobileno" id="mobileno" onkeypress="return clearField()"/> </td>
<td><span id="error"></span> </td>
</tr>

<tr>
   <td>  alternate mobileno:<input type="text" name="mobileno1"/></td>
</tr>

<tr>
<td>mail-id:<sup id="star">*</sup> </td>
 <td><input type="text" name="mail" id="mail" onkeypress="return clearField()"/></td>
    <td> <span id="error"></span></td>
      </tr> 
      
      <tr>
          <td>  alternate mailid:<input type="text" name="mail1"/></td>
            </tr>
     
     <tr>       
<td>present address:<sup id="star">*</sup></td>
<td><textarea name="message" rows="10" cols="30" id="message" onkeypress="return clearField()"></textarea></td> 
<td><span id="error"></span> </td>
</tr>

<tr>
<td>permanent address:<sup id="star">*</sup></td>
<td><textarea name="message1" rows="10" cols="30" id="message1" onkeypress="return clearField()"></textarea> </td>
<td><span id="error"></span> </td>
</tr>

<tr>
<td>Occupation:<sup id="star">*</sup></td>
<td><input type="text" name="occupation" id="occupation" onkeypress="return clearField()"/></td>
<td><span id="error"></span> </td>
</tr>


<br>

<tr>

<td>years of exp:<input type="text" name="exp" /></td>

</tr>

<tr>

<td>past cmp name:<input type="text" name="name" /></td> 

</tr>

<tr>

  <td> past cmp period: <input type="text" name="period"/></td>
  
    </tr>
    
  <tr>  

<td>date of joining:<input type="text" name="doj" /></td> 

</tr>

<tr>
    
      <td>currentctc:<input type="text" name="currentctc" /></td>
     
      </tr>
      
  <tr>    

<td>adv sal:<input type="text" name="ads"  /> </td>
<td><span id="error"></span> </td> 
</tr>

<tr>
   
   <td> adv sal date:  <input type="text" name="adsd"/></td>
    
      </tr>
      
      <tr>

<td>adv sal terms:<input type="text" name="adst" /></td>

</tr>

<tr>
<td>designation:<select name="designation">
<option value="trainee">trainee</option>
<option value="developer">developer</option>
<option value="senior developer">senior developer</option>
<option value="software engineer">software engineer</option>
<option value="senior software engineer">senior software engineer</option>
</select></td>
</tr>
<tr>
<td>technology:<select name="technology">
<option value="java">java</option>
<option value="dotnet">dot net</option>
</select></td>
</tr>
<tr>
<td><input type="submit" value="register" onclick="return validation()"></td>
</tr>
</table>
</pre>
</form>


</body>
</html>