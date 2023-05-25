package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlets.RegisterDao;
import com.servlets.RegisterPojo;

/**
 * Servlet implementation class Appointment
 */
public class Appointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Appointment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String pname = request.getParameter("pname");
		String age =request.getParameter("age");
		String mobile =request.getParameter("mobile");
		
		AppointmentPojo ap = new AppointmentPojo(pname,Integer.parseInt(age),mobile);
		AppointmentDao adao = new AppointmentDao();
		String str = adao.addAppointment(ap);
		if(str.equals("success"))
		{
			response.sendRedirect("success.jsp");
		}
		else
		{
			response.sendRedirect("appointment.jsp");
		}
	}

}
