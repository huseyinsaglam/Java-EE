package helloservletannotatiin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloServletAnnotation")

public class ServletAnnotation extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw =resp.getWriter();
		pw.print("hello Servlet Annotation");
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	}

}
