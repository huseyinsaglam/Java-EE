package context_dosya;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;


@WebServlet("/resources")
public class Notes extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context= getServletContext();
		
		InputStream inputstream = context.getResource("/WEB-INF/properties/myFile.properties").openStream();
		
		InputStream inputstream2 = context.getResource("/WEB-INF/hs.txt").openStream();
		
	int content;
	while((content = inputstream.read())!=-1)
	{
		System.out.print((char)content);
		
	}
	System.out.println(" \n");
	while((content = inputstream2.read())!=-1)
	{
		System.out.print((char)content);
	}
		
		
		
		
	
	}
}
