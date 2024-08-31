package com.qsp.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value = "/createSession")
public class CreateSession extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("un");
		String pass=req.getParameter("pass");
		
		HttpSession session=req.getSession();
		session.setAttribute("name", name);
		session.setAttribute("password", pass);
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>session created</h1>");
	}
}
