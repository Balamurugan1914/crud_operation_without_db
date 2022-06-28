<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<td>Employee id</td>
			<td>Employee Name</td>
			<td>Employee Designation</td>
			<td>Salary</td>
		</tr>
<c:forEach items="${view}" var="eachBook">
<tr>
<td><c:out value="${eachBook.id}"/></td>
<td><c:out value="${eachBook.employeeName}"/></td>
<td><c:out value="${eachBook.employeeDesignation}"/></td>
<td><c:out value="${eachBook.salary}"/></td>
<tr>
</c:forEach>
		

	</table>



</body>
</html>