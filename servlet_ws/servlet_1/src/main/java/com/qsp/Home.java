package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/home")
public class Home extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Object u=session.getAttribute("user");
		Object p=session.getAttribute("password");
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>"+u+"</h1>");
		pw.print("<h1>"+p+"</h1>");
		session.invalidate();
	}
}
