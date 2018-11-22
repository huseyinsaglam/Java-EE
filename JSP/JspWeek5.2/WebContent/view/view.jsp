<%@page import="_03.model.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="_03.model.Person" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${ personattribute.name }
${ personattribute ["name"] }
<%

Person person= (Person)request.getAttribute("personattribute");


%>


<%= person.getName() %>
<%= person.getSurname() %>
<%= person.getAge()%>
 
 </br>

<jsp:useBean id="personattribute" class="_03.model.Person" scope="request"/>
<jsp:getProperty property="name" name="personattribute"/>
<jsp:getProperty property="surname" name="personattribute"/>
<jsp:getProperty property="age" name="personattribute"/>





 </br>

<jsp:useBean id="nobean" class="_03.model.Person" scope="request"/>
<jsp:setProperty property="name" name="nobean" value="fenerbahce"/>
<jsp:setProperty property="surname" name="nobean" value="spor kulubü"/>
<jsp:setProperty property="age"  name="nobean" value="100"/>


<jsp:getProperty property="name" name="nobean" />
<jsp:getProperty property="surname" name="nobean" />
<jsp:getProperty property="age"  name="nobean" />







</body>
</html>