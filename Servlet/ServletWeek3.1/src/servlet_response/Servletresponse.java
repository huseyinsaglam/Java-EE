package servlet_response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseservlet")
public class Servletresponse extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String res =resp.getCharacterEncoding();
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter pw =resp.getWriter();
	     pw.print("<html>");
         pw.print("<head> <meta charset='UTF-8'> </head>");
         pw.print("<body>");
        
         pw.print("</body> </html>");
		
		pw.println("hüseyin saðlam");
		pw.println("ÞÜÇÇÐÐÐÞÞÞ");
		}
}
