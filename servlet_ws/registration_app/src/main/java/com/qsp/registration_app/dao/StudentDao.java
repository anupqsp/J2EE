package com.qsp.registration_app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.qsp.registration_app.dto.Student;

public class StudentDao {

	public static Connection con;
	static {
		try {
			// 1st step
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "ROOT");
			System.out.println("static");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void registerStudent(Student student) {

		try {
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, student.getMail());
			ps.setString(2, student.getName());
			ps.setLong(3, student.getPhone());
			ps.setString(4, student.getCourse());
			ps.setString(5, student.getEducation());
			ps.setString(6, student.getStream());
			ps.setInt(7, student.getYearOfPass());
			ps.setString(8, student.getGender());
			ps.setString(9, student.getFeesPaid());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	public boolean login(String mail, long phone) {
		try {

			PreparedStatement ps = con.prepareStatement("select * from student where mail=? and phone=?");
			ps.setString(1, mail);
			ps.setLong(2, phone);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		Student student = new Student();
		student.setMail("@example.com");
		student.setName("John Doe");
		student.setPhone(1234567890L);
		student.setCourse("Computer Science");
		student.setEducation("Bachelor's");
		student.setStream("Software Engineering");
		student.setYearOfPass(2024);
		student.setGender("Male");
		student.setFeesPaid("Paid");
		dao.registerStudent(student);
	}
}
