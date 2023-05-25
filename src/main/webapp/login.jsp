<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="stylesheet/style.css" rel="stylesheet">
        <link href="stylesheet/regi.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <div class="header">
                <div class="inner">
                    <jsp:include page="navbar.jsp"/>

                    <div class="lower-header">
                        <div class="img">
                            <img src="images/login.svg" alt="img"/>
                        </div>
                        <div class="lower-header-right-form">
                            <h4>Login Here</h4>
                         	<form action="Login" method="post">
                         		<table>
                         			<tr>
                         				<td>Enter your email</td>
                         				<td><input type="text" name="email" required/></td>
                         			</tr>
                         			<tr>
                         				<td>Enter your password</td>
                         				<td><input type="text" name="password" required/></td>
                         			</tr>
                         		</table>
                         		
                         		<div class="redirect">
                         			<a href="register.jsp">Don't have an account?</a>
                         		</div>
                         		
                         		<div class="btn">
                         			<button class="submit">Submit</button>
                         		</div>
                         	</form>
                        </div>
                    </div>
                </div>
            </div>

            <div class="footer">
                <h4>
                    Address : Shree Hospital, Dr.Prasad Rao  Road, Near Sawarkar Garden, Mumbai Central (E), Mumbai- 400 011
                </h4>
                <h5>
                    Copyright © 2022 ShreetHospital. All rights reserved.
                </h5>
            </div>
        </div>
    </body>
</html>