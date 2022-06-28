<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Handling</title>
</head>
<body>
<%= session.getId() %>
Session id : <c:out value="${pagecontext.session.id}"/>
<c:set value="bala" scope="session" var="name"></c:set>
<a href="first.jsp">First</a>
<a href="WelcomeServlet">Home</a>

</body>
</html>