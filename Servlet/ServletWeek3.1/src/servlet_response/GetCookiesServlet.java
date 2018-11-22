package servlet_response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookies")
public class GetCookiesServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] cookies=req.getCookies();
		
		if(cookies != null)
		{
			for(Cookie cookie :cookies)
			{
				System.out.println(cookie.getName());
				System.out.println(cookie.getValue());
			}
		}
		else
		{
			System.out.println("no cookie");
		}
	}
}
