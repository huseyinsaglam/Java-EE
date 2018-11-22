package servletconfig;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Notes extends HttpServlet {
   
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		ServletConfig config = getServletConfig();
		
		String name = config.getInitParameter("javacc");
		String passoword = config.getInitParameter("passwordc");
		String servletname= config.getServletName();
		
		System.out.println("name"+name);
		System.out.println("passoword"+passoword);
		System.out.println("servletname"+servletname);
		
		Enumeration<String> enm = config.getInitParameterNames();
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}
}
