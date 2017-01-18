/**
 * 
 */
function validation()
{
	
	var fs=document.getElementById("firstname").value;
	var ls=document.getElementById("lastname").value;
	var fas=document.getElementById("fathersname").value;
	var dob=document.getElementById("dob").value;
	var mob=document.getElementById("mobileno").value;
	var email=document.getElementById("mail").value;
	var prsntadd=document.getElementById("message").value;
	var prmntadd=document.getElementById("message1").value;
	var occ=document.getElementById("occupation").value;
	
	
	
	if(fs==""||fs==null)
	{
	//alert("please enter fs");
	document.getElementById("error").innerHTML="please enter fs";
	return false;
	}
	if(ls==""||ls==null)
	{
	alert("please enter ls");
	//document.getElementById("error").innerHTML="please enter ls";
	return false;
	}
	if(fas==""||fas==null)
	{
	alert("please enter fas");
	//document.getElementById("error").innerHTML="please enter fas";
	return false;
	}
	if(dob==""||dob==null)
	{
	alert("please enter dob");
	//document.getElementById("error").innerHTML="please enter dob";
	return false;
	}
	 if(mob==""||mob==null)
	{
	alert("please enter mob");
	//document.getElementById("error").innerHTML="please enter mob";
	return false;
	}
	 if(email==""||email==null)
		{
		alert("please enter email");
		//document.getElementById("error").innerHTML="please enter mail";
		return false;
		}
	 if(prsntadd==""||prsntadd==null)
	{
	alert("please enter prsntadd");
	//document.getElementById("error").innerHTML="please enter add";
	return false;
	}
	
	 if(prmntadd==""||prmntadd==null)
	{
	alert("please enter prmntadd");
	//document.getElementById("error").innerHTML="please enter prmntadd";
	return false;
	}
	 if(occ==""||occ==null)
		{
		alert("please enter occ");
		//document.getElementById("error").innerHTML="please enter occu";
		return false;
		}
	
	
	else
		
		return true;
	
	
	
	}
	
	function clearField()
	{
		document.getElementById("error").innerHTML=" ";
	
	}