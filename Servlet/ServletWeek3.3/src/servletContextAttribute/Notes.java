package servletContextAttribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/setServletAttribute")
public class Notes extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		
		context.setAttribute("name", "huseyin");
		context.setAttribute("age", 23);
		
		int [] dizi= {10,202,30};
		
		context.setAttribute("sayilar", dizi);
	}

}
