package el.cookie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/abc")
public class Notes extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie= new Cookie("username", "huseyin");
		Cookie cookie2 = new Cookie("passoword", "123456");
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("folder/java.jsp");
		dispatcher.forward(req, resp);
	}

}
