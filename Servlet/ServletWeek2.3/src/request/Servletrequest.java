package request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletrequest")
public class Servletrequest extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("servletrequest");
		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String gender = req.getParameter("gender");
		String maritalStatus = req.getParameter("marital status");
		String[] langs = req.getParameterValues("lang");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(gender);
		System.out.println(maritalStatus);
		
		if (langs != null) {
			for (String name : langs) {
				System.out.println(langs);
			}
	}

}}
