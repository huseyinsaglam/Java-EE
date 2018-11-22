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
<c:set var="sessionattribute" scope="session" value="70"></c:set>

<c:choose>
 <c:when test="${sessionattribute>70 }">
      <h1>basarili</h1></c:when>
      
      <c:when test="${sessionattribute<70 }">
      <h1>basarisiz</h1></c:when>
      
      <c:otherwise > <h1>orta</h1></c:otherwise>
 



 </c:choose>
</body>
</html>