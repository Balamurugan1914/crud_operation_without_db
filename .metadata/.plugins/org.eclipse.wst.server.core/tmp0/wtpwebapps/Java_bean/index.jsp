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
<%@include file="header.html" %>


<div>

<p style="color: red"><c:out value="${param.errormessage}"/>
<form action="addbook.jsp">
	<label for="userName">User Name</label>
	<input type="text" name="userName"/>
	<label for="password">Password</label>
	<input type="text" name="password"/>
	<input type="submit" value="Login"/>
</form>


</div>



<jsp:include page="footer.jsp"/>

</body>
</html>