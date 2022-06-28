<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center"> ${Heading}</h1>
<h2> STUDENT LIST</h2>
<table>
<tr>
<td>roll number</td>
<td>Student name</td>
<td>Marks & scored</td>
</tr>
<tr>
<td>${Student.rollNumber}</td>
<td>${Student.name}</td>
<td>${Student.marks}</td>
</tr>

</table>




</body>
</html>