<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Employee list</h2>

	<table border="1" >
	<tr>
			<td>firstname</td><br>
			<td>lastname</td>
			<td>hobbies</td>
			<td>qualification</td>
		</tr>
	
		<tr>
			<td>${Employee.firstname}</td>
			<td>${Employee.lastname}</td>
			<td>${Employee.hobbies[0]}${Employee.hobbies[1]}${Employee.hobbies[2]}</td>
			<td>${Employee.qualification}</td>
		</tr>
	</table>








</body>
</html>