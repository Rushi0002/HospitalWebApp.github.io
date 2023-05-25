package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("name");
		String email =request.getParameter("email");
		String password =request.getParameter("password");
		
		RegisterPojo rp = new RegisterPojo(name,email,password);
		RegisterDao rdao = new RegisterDao();
		String str = rdao.createUser(rp);
		if(str.equals("success"))
		{
			response.sendRedirect("login.jsp");
		}
		else
		{
			response.sendRedirect("Register.jsp");
		}
	}

}
