package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DynamicQuery {
	public static void main(String[] args) {
		try {
			// 1st step
			Class.forName("org.postgresql.Driver");
			// 2nd step
	   Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "ROOT");
			// 3rd step
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
			//assigning value to delimiter
			ps.setInt(1, 27);
			ps.setString(2, "vishal");
			//4th step
			ps.executeUpdate();
			System.out.println("vishal is executed");
			//5th step
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
