package response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/response")
public class Notes extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("huseyin", "saglam");
		resp.setHeader("huseyin", "sglm");
		resp.addHeader("huseyin", "saglam5");
		resp.setHeader("huseyin1", "saglam1");
		resp.addHeader("huseyin2", "saglam2");
		String name=resp.getHeader("huseyin");
		PrintWriter pw = resp.getWriter();
		pw.println(name);
		
	}
}
