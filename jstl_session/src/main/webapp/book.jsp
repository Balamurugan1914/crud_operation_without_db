<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="first.jsp">
		<label for="bookName">Book</label> <select name="bookName" id=""
			multiple="multiple">
			<option value="java">java</option>
			<option value="spring">Spring</option>
			<option value="Python">Python</option>
			<option value="HTML">Html</option>
		</select> <input type="submit" value="submit" />
	</form>
</body>
</html>