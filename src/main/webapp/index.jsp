<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Shree Hospital</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="stylesheet/style.css" rel="stylesheet">
    </head>
    <body>
    
<%
session = request.getSession(false);
session.invalidate();
%>
        <div class="container">
            <div class="header">
                <div class="inner">
                    <jsp:include page="navbar.jsp"/>

                    <div class="lower-header">
                        <div class="img">
                            <img src="images/doctor.svg" alt="img"/>
                        </div>
                        <div class="lower-header-right">
                            <h4>Provide Best Quality Health Treatment.</h4>
                            <h2>We Care About Your Health.</h2>
                            <p>
                                Shree Hospital is a multispecialty care hospital in Mumbai, providing the highest standard of clinical expertise and nursing care.
                            </p>
                            
                            <a href="appointment.jsp">  
       							<button>BOOK APPOINTMENT</button>  
     						</a>
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