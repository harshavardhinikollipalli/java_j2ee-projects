/**
 * 
 */function validation()
{
	var employeeId=document.getElementById("employeeid").value;
	
	if(employeeId==""||employeeId==null)
		{
		//alert("please enter employee Id");
		document.getElementById("error").innerHTML="please enter id";
		return false;
		}
	else
		return true;
	
	
	
	}
	
	function clearField()
	{
		document.getElementById("error").innerHTML=" ";
	}
