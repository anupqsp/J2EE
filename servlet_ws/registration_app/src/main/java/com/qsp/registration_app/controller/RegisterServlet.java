package com.qsp.registration_app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qsp.registration_app.dao.StudentDao;
import com.qsp.registration_app.dto.Student;
@WebServlet(value="/reg")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao dao = new StudentDao();
		System.out.println(dao);
		Student student = new Student();
		student.setMail(req.getParameter("m"));
		student.setName(req.getParameter("n"));
		student.setPhone(Long.parseLong(req.getParameter("p")));
		student.setCourse(req.getParameter("c"));
		student.setEducation(req.getParameter("e"));
		student.setStream(req.getParameter("s"));
		student.setYearOfPass(Integer.parseInt(req.getParameter("y")));
		student.setGender(req.getParameter("g"));
		student.setFeesPaid(req.getParameter("f"));

		System.out.println(student);
		dao.registerStudent(student);
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>Registered-------!</h1>");
	}
}
