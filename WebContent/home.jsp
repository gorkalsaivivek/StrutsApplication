<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Birthday Reminder Application</title>
</head>
<body>
<h4>Welcome to Birthday Reminder Application</h4>

<img src="happy.jpg" alt="Angry face" width="500" height="200" />
<s:form action="authenticate">
   <s:textfield name="emailId" label="EmailId"/>
   <s:textfield name="password" label="Password"/>
   <s:submit label="login"/>
   <hr/>
   </s:form>
<a href="/StrutsApplicationAug20/login.jsp">New User</a>


</body>
</html>