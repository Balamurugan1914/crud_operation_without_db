<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>showBooks</title>
</head>

<body>
<table border="1">
	<tr>
		<td>Book Number</td>
		<td>Book Name</td>
		<td>Author Name</td>
		<td>Price</td>
	</tr>

<c:forEach items="${book}" var="eachbook">
<tr>
<td><c:out value="${eachbook.bookNumber}"/></td>
<td><c:out value="${eachbook.bookName}"/></td>
<td><c:out value="${eachbook.authorName}"/></td>
<td><c:out value="${eachbook.price}"/></td>

</c:forEach>
</table>
<a href="addBook">More add</a>
</body>
</html>