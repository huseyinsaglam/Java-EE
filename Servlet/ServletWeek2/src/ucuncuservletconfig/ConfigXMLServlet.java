package ucuncuservletconfig;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigXMLServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletConfig config = (ServletConfig) getServletConfig();
		
		String name = config.getInitParameter("java");
		String passoword = config.getInitParameter("passoword");
		String servletname = config.getServletName();
		
		
		System.out.println("servlet name :" +servletname);
		System.out.println("name : "+name);
		System.out.println("passoword"+passoword);
		
	
		Enumeration<String> params = config.getInitParameterNames();
		while (params.hasMoreElements()) {
			System.out.println(params.nextElement());
		}
	}
	
}
