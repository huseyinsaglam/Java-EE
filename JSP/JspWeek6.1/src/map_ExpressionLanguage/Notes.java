package map_ExpressionLanguage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExpressionLanguage")
public class Notes extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Map<String, Integer> map = new HashMap<String , Integer>();
		
		map.put("huseyin", 1000);
		map.put("fenerbahce", 1907);
		map.put("hatay", 31);
		
		req.setAttribute("mymap", map);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("folder/java.jsp");
		dispatcher.forward(req, resp);
		
		
		
	}

	
}
