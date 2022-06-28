<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>


<body>

<c:out value="${add}"/>

<h1>Add Student Details</h1>

<div>

<p style="color: green">
<c:out value="${message}" />


</div>

<form action="add" method="post">
	<div><label for="roll">Roll Number</label><input type="text" name="rollNumber" id="rollNumber"/></div>
	<div><label for="studentName">Name</label><input type="text" name="studentName" id="studentName"/></div>
	<div><label for="studentDegree">Degree</label><input type="text" name="studentDegree" id="studentDegree" /></div>
	<div><label for="studentMarks">Marks</label><input type="text" name="studentMarks" id="studentMarks" /></div>
	<div><input type="submit" value="submit"></div>
	<input type="reset"  value="clear">
</form>

</body>
</html>