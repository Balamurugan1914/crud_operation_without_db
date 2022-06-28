<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="show1" >

		<label>FirstName</label> <input type="text" name="firstName"><br>
		<label>LastName</label> <input type="text" name="lastName"><br>

		<label>Hobbies</label><br>
		
			<input type="checkbox"  id="check" value="chess" name="hb"><label for="chess">Chess</label><br>
			<input type="checkbox"  id="carrom" value="carrom" name="hb"><label for="carrom">Cricket</label><br>
			<input type="checkbox"  id="footBall" value="football" name="hb"f><label for="footBall">Football</label><br>
		
		
			<label>Qualification</label><br> 
			<input type="radio" value="Engineering" name="rd"><label>Engineering</label><br>
			<input type="radio" value="Arts" name="rd"><label>Arts</label>
			<input type="radio" value="Science" name="rd"><label>Science</label><br>
		
		<input type="submit" value="submit">
	</form>
</body>
</html>