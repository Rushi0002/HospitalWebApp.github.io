package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String lemail =request.getParameter("email");
		String lpassword =request.getParameter("password");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		String query = "from LoginPojo";
		Query q = s.createQuery(query);
		List<LoginPojo> li = q.list();
		
		HttpSession session = request.getSession();
		
		int count = 0;
		for(LoginPojo lp:li)
		{
			if(lemail.equals(lp.getEmail()) && lpassword.equals(lp.getPassword()))
			{
				session.setAttribute("lemail", lemail);
				count+=1;
			}
		}
		
		if(count!=0)
		{
			response.sendRedirect("admin.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
		s.close();
	}

}
