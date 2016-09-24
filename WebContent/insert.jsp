<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add your friend</title>
Welcome <s:property value="customer.emailId"></s:property> 
</head>
<body>
<%@ page import="com.practice.Customer"%>
<%

Customer customer=new Customer();
customer.getEmailId();

%>
<s:form action="addParticipant">
   <s:textfield name="emailId" label="emailId"/>
   Email ID:<s:property value=<%=customer.getEmailId()%> /> 
  <s:textfield name="emailId" value="%{customer.emailId}"/>
   <s:textfield name="name" label="Name"/>
   <s:textfield name="birthDate" label="BirthDate"/>
   <s:textfield name="birthMonth" label="BirthMonth"/>
   <s:textfield name="birthYear" label="BirthYear"/>
   
   <s:submit label="AddFriendDeatils"/>
   <hr/>
   </s:form>
</body>
</html>