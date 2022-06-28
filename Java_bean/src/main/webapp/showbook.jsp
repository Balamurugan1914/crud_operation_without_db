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
<%@include file="header.html" %>
<%--<jsp:useBean id="service" class="com.demo.service.BookService" scope="session"></jsp:useBean> --%>
<table border="1">
	<tr>
		<td>Book Number</td>
		<td>Book Name</td>
		<td>Author Name</td>
		<td>Price</td>
		<td>Edit</td>
		<td>Delete</td>
	</tr>
<%--<c:set var="book" value="${service.findAll()}"/> --%>
<c:forEach items="${book}" var="eachBook">
<tr>
<td><c:out value="${eachBook.bookNumber}"/></td>
<td><c:out value="${eachBook.bookName}"/></td>
<td><c:out value="${eachBook.authorName}"/></td>
<td><c:out value="${eachBook.price}"/></td>
<td><a href="edit?id=<c:out value='${eachBook.bookNumber}' />">Edit</a></td>
<td><a href="delete?id=<c:out value='${eachBook.bookNumber}' />">Delete</a></td>
</c:forEach>
</table>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>