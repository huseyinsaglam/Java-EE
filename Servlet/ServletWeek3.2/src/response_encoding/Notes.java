package response_encoding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/encoding")
public class Notes extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String encoding= resp.getCharacterEncoding();
		 resp.setCharacterEncoding("ISO-8859-9");
		 PrintWriter pw = resp.getWriter();
		 pw.println("çþðçþþð");
		 
	}

}
