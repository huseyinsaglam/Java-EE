package servlet_header;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletheader")
public class Servletheader extends HttpServlet{
  
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie username = new Cookie("username", "huseyin");
		Cookie passoword = new Cookie("passoword", "1233456");
		
		resp.addCookie(username);
		resp.addCookie(passoword);
	}
	
}
