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

	<h1>Add employee details</h1>

	<div>

		<p style="color: green">

			<c:out value="${alert}"></c:out>
	</div>

	<form action="insert" method="post">
		<div>
			<label for="id">Id</label> <input type="text" name="id" id="id" />
		</div>
		<div>
			<label for="employeeName">Employee Name</label> <input type="text"
				name="employeeName" id="employeeName" />
		</div>
		<div>
			<label for="employeeDesignation">Employee Designation</label> <input
				type="text" name="employeeDesignation" id="employeeDesignation" />
		</div>
		<div>
			<label for="salary">Salary</label> <input type="text" name="salary"
				id="salary" />
		</div>
		<div>
			<input type="submit" value="ADD"> <input type="reset"
				value="clear">

		</div>
	</form>




</body>
</html>