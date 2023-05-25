<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="org.hibernate.Session"
	import="org.hibernate.SessionFactory"
	import="org.hibernate.Transaction"
	import="org.hibernate.cfg.Configuration" import="java.util.*"
	import="org.hibernate.Query" import="com.form.AppointmentPojo"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Shree Hospital</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="stylesheet/style.css" rel="stylesheet">
<link href="stylesheet/admin.css" rel="stylesheet">
</head>
<body>
<%
session = request.getSession(false);
String lemail =(String) session.getAttribute("lemail");
if(lemail!=null)
{	
%>
	<div class="container">
		<div class="header">
			<div class="inner">
				<div class="nav">
					<div class="heading">
						<h4>
							<img src="images/sign.svg" width="50px" height="50px" alt="sign" />
							SHREE HOSPITAL
						</h4>
					</div>
					<div class="links">
						<ul>
							<li>Welcome <%=lemail %></li>
							<li><a href="index.jsp">Logout</a></li>
						</ul>
					</div>
				</div>

				<%
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				SessionFactory factory = cfg.buildSessionFactory();
				Session s = factory.openSession();
				String query = "from AppointmentPojo";
				Query q = s.createQuery(query);
				List<AppointmentPojo> li = q.list();
				%>

				<div class="details">
					<table>
						<thead>
							<tr>
								<td>Id</td>
								<td>Patient Name</td>
								<td>Patient Age</td>
								<td>Patient Mobile Number</td>
								<td>Action</td>
							</tr>
						</thead>
						<tbody>
							<%
							for (AppointmentPojo ap : li) {
								int pid = ap.getPid();
								String pname = ap.getPname();
								int age = ap.getAge();
								String mobile = ap.getMobile();
							%>
							<tr>
								<td><%=pid%></td>
								<td><%=pname%></td>
								<td><%=age%></td>
								<td><%=mobile%></td>
								<td><a href="Delete?value=<%=pid%>">Delete</a></td>
							</tr>
							<% 
							}
							
							%>
						</tbody>
					</table>
				</div>

			</div>
		</div>
	</div>
<%
} 
else if(lemail==null)
{
	response.sendRedirect("login.jsp");	
}
%>
</body>
</html>