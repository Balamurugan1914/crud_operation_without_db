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
<h2>ADD STUDENT</h2>
<form action="show" method="post">
<label>Roll Number</label>
<input type="text" name="Rollnumber">
<label>Student name</label>
<input type="text" name="name">
<label>Mark</label>
<input type="text" name="marks">


<input type="submit" value="add">




</form>


</body>
</html>