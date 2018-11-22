<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="sessionAttribute" scope="session" value="mysession"> </c:set>

<c:out value=" ${sessionAttribute}"></c:out>


<% java.util.Map map = new HashMap(); 

request.setAttribute("admin", map);

%>

<c:set target="${ admin }" property="key1" value="value1"></c:set>
<c:set target="${ admin }" property="key2" value="value2"></c:set>

</br>

<c:out value="${ admin.key1 }"></c:out>
<c:out value="${ admin.key2 }"></c:out>

</body>
</html>