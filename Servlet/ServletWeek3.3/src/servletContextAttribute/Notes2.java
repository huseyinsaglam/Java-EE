package servletContextAttribute;

import java.io.IOException;
import java.lang.reflect.Array;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.xml.internal.bind.CycleRecoverable.Context;
@WebServlet("/getServletAttribute")
public class Notes2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		ServletContext context = getServletContext();
		
		String name = (String) context.getAttribute("name");
		Integer age = (Integer) context.getAttribute("age");
		Array [] dizi =(Array[]) context.getAttribute("dizi");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(dizi);
		System.out.println("----------------");
	}
}
