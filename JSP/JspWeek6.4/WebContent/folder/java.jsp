<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${param.firstName }
${param.lastName }
${param.gender }
${paramValues.maritalstatusName[0] }
${paramValues.maritalstatusName['1'] }
${paramValues.maritalstatusName[2] }
${paramValues.maritalstatusName[3] }
${paramValues.lang[0] }
${paramValues.lang["1"] }
${paramValues.lang['2'] }

</body>
</html>