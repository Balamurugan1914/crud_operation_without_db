<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="bookS" method="post">
		<div>
			<label for="bookNumber">Book Number</label><input type="text"
				name="bookNumber" />
		</div>
		<div>
			<label for="bookName">Book Name</label><input type="text"
				name="bookName" />
		</div>
		<div>
			<label for="authorName">Author Name</label><input type="text"
				name="authorName" />
		</div>
		<div>
			<label for="price">Price</label><input type="text" name="price" />
		</div>
		<input type="submit" value="Save"/>




	</form>



</body>
</html>