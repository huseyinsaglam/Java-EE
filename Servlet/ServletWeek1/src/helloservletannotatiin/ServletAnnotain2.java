package helloservletannotatiin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/url1","/url2","/url3"})

public class ServletAnnotain2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw =resp.getWriter();
		pw.print("hello Servlet Annotation More Servlet");
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	}

}
