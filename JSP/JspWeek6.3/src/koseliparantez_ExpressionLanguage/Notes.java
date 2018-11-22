package koseliparantez_ExpressionLanguage;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/src")
public class Notes extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("huseyin");
		array.add("fenerbahce");
		array.add("spor kulubü");
		
		req.setAttribute("mylist", array);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("folder/javajsp.jsp");
		dispatcher.forward(req, resp);
		
	}
}
