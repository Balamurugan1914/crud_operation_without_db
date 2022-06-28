<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 style="text-align: center;">${Welcome2}</h1>

	<table border="1">
		<tr>
			<td>Rollnumber</td>
			<td>Student Name</td>
			<td>Degree</td>
			<td>Qualification</td>
		</tr>

		<tr>
			<td>${Student.roll}</td>
			<td>${Student.studentname}</td>
			<td>${Student.degree}</td>
			<td>${Student.subject[0]},${Student.subject[1]},${Student.subject[2]},${Student.subject[3]}</td>
		</tr>

</table>
<a href="add">Back</a>




</body>
</html>