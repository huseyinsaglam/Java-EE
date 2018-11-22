package model3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Model1;
import model.Model2;
@WebServlet("/ornek")
public class Model3 extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Model1 model1 = new Model1(100, "Software");
		Model2 model2 = new Model2(1, "huseyin saglam", model1);
		req.setAttribute("mymodel2", model2);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("folder/java.jsp");
		dispatcher.forward(req,resp);
	  
	}

}
