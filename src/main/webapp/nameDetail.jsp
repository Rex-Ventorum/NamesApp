<%-- 
    Document   : nameDetail
    Created on : Feb 6, 2018, 8:25:05 PM
    Author     : andrewbiewer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSP Page</title>
	</head>
	<body>
            <h1><c:out value="${name.first}"/> <c:out value="${name.last}"/></h1>
            <p><c:out value="${name.address.street}"/></p>
            <p><c:out value="${name.address.city} ${name.address.state}, ${name.address.zip}"/> </p>
	</body>
</html>
