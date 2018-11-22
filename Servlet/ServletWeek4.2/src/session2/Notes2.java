package session2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session2")
public class Notes2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		HttpSession session = req.getSession();
		session.setAttribute("username", "huseyin");
		
		String url = "/getsession";
		pw.println("<a href= \"" + url + "\"> adrese gidiniz </a>");
		
	}
}
