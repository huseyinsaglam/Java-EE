package koseliparantez_ExpressionLanguage;

import java.io.IOException;

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
		
		String Array[]= {"huseyin"," saglam", "fenerbahce" };
		
		req.setAttribute("myarray", Array);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("folder/java.jsp");
		dispatcher.forward(req, resp);
				
		
	}

}
