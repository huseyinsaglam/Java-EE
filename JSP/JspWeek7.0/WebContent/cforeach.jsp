<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
<c:forEach var="i" begin="1" end="10"> 
${i }
</c:forEach>

<% int number[]= {10,20,30,40,50};
request.setAttribute("mynumber", number);
%>

<c:forEach var="n" items=" ${ mynumber}">
${n }
</c:forEach>

<% java.util.List mylist= new java.util.ArrayList ();

mylist.add("huseyin");
mylist.add("saglam");
mylist.add("fenerbahce");

session.setAttribute("List", mylist);
%>

<c:forEach var="e" items="${List }">
${e }
</c:forEach>


<% java.util.Map map = new java.util.HashMap();

map.put("huseyin", "sagglam");
map.put("hs", "saglam");

session.setAttribute("mymap", map);

%>

<c:forEach var="ek" items="${mymap }">
${ek.key } , ${ek.value }
</c:forEach>


</body>
</html>