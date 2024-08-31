package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeJDBC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=ROOT");
			Statement stm = con.createStatement();
			// adding multiple query to batch
			stm.addBatch("insert into student values(201,'xyz')");
			stm.addBatch("insert into student values(202,'abc')");
			stm.addBatch("update student set name='xyz12' where id=201");
			stm.addBatch("delete from student where id=202");
			// executing the batch
			stm.executeBatch();
			System.out.println("batch executed");
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
