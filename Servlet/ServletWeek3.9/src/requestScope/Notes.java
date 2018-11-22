package requestScope;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/requestattribute")
public class Notes extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("name", "asus");
		req.setAttribute("age", 25);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Jspfile/hello.jsp");
		dispatcher.forward(req, resp);
		
	}
}
