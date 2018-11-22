<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ornekcalısma1" class="model2.Person"></jsp:useBean>

<jsp:setProperty property="name" name="ornekcalısma1"/>
<jsp:setProperty property="surname" name="ornekcalısma1" />
<jsp:setProperty property="age" name="ornekcalısma1" />


<jsp:getProperty property="name" name="ornekcalısma1" />
<jsp:getProperty property="surname" name="ornekcalısma1" />
<jsp:getProperty property="age" name="ornekcalısma1" />


</body>
</html>