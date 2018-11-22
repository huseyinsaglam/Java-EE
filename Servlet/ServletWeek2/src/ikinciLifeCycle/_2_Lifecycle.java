package ikinciLifeCycle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifecyle")

public class _2_Lifecycle extends HttpServlet{
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("init...");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget...");
		System.out.println("do get yap daa");
		System.out.println("do get yap daa ojjýnhýjun kpokpoka<po");
	}
}
