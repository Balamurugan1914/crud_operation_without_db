<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: cyan;">

<h1 style="text-align: center;">${Welcome1}</h1>


	<form action="ShowDetails" method="post">
		Rollnumber: <input type="number" name="roll"
			placeholder="Enter the roll number" /><br> StudentName: <input
			type="text" name="studentname" placeholder="Enter the Student name" /><br>
		Degree : <input type="radio" name="degree" value="Arts" /> Arts
		<input type="radio" name="degree" value="Engineering" /> Engineering
		<input type="radio" name="degree" value="Science" /> Science <br>
		Subject : <input type="checkbox" name="subject" value="c++" /> c++ 
		<input type="checkbox" name="subject" value="java" /> java  <input
			type="checkbox" name="subject" value="php" /> php  <input
			type="checkbox" name="subject" value="HTML" /> HTML<br> <input
			type="submit" value="submit" />





	</form>




</body>
</html>