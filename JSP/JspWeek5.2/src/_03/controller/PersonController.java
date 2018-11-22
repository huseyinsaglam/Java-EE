package _03.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.glass.ui.View;

import _03.model.Person;
@WebServlet("/jsp")
public class PersonController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Person person= new Person();
		person.setName("huseyin");
		person.setSurname("saglam");
		person.setAge(20);
		
		req.setAttribute("personattribute",person);
		RequestDispatcher dispatcher = req.getRequestDispatcher("view/view.jsp");
		dispatcher.forward(req,resp);
	}

}
