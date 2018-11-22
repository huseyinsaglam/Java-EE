package servletcontext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

import jdk.nashorn.internal.runtime.regexp.joni.Config;

public class Notes extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=getServletContext();
		
		String name =context.getInitParameter("hs");
		String name1 =context.getInitParameter("yazýlým");
		
		
		System.out.println("name : "+name);
		System.out.println("name1 : "+name1);
	}

}
