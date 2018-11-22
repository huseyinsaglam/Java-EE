package el.notes1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/abc")
public class Notes extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("huseyin", "saglam");
		getServletContext().setAttribute("huseyin", 1907);
		req.getSession().setAttribute("huseyin", "Devoleper");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("folder/javajsp.jsp");
		dispatcher.forward(req, resp);
	}

}
