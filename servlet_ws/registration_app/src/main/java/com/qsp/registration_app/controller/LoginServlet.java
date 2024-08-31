package com.qsp.registration_app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qsp.registration_app.dao.StudentDao;
@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String mail=req.getParameter("mail");
	Long phone=Long.parseLong(req.getParameter("phone"));
	StudentDao dao=new StudentDao();
	boolean res=dao.login(mail, phone);
	PrintWriter pw=resp.getWriter();
	if(res) {
		pw.print("<h1>Login successfull</h1>");
	}else {
		pw.print("<h1>invalid creadentials</h1>");
	}
	}
}
