package com.qsp;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/emp")
public class ServletContextExample extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext sc=getServletContext();
		Employee e=new Employee();
		e.setId(101);
		e.setName("Arjit Singh");
		e.setPhone(9893240000l);
		sc.setAttribute("e1", e);
		Employee e2=new Employee();
		e2.setId(102);
		e2.setName("darshan raval");
		e2.setPhone(7087933788l);
		sc.setAttribute("e2", e2);
		Employee e3=new Employee();
		e3.setId(103);
		e3.setName("Tylar Swift");
		e3.setPhone(7087933788l);
		sc.setAttribute("e3", e3);
	}

}
