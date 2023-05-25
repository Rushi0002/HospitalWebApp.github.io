<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage = "true" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Login</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="stylesheet/style.css" rel="stylesheet">
<link href="stylesheet/contact.css" rel="stylesheet">
<link href="stylesheet/success.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="header">
			<div class="inner">
				<jsp:include page="navbar.jsp" />

				<div class="hospital-img">
					<img src="images/error.svg" width="300px" height="300px"/>
					<h1 style="color:red;">Page Not Found. Something Went Wrong.</h1>
				</div>

				
			</div>
		</div>
	</div>
</body>
</html>