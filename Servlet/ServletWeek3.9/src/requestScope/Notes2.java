package requestScope;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getrequestattribute")
public class Notes2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=(String) req.getAttribute("name");
		Integer age =(Integer) req.getAttribute("age");
		System.out.println(name);
		System.out.println(age);
	}
}
