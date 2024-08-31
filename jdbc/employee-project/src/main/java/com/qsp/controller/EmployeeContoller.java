package com.qsp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qsp.model.Employee;

public class EmployeeContoller {
	static Connection con;
	static String url="jdbc:postgresql://localhost:5432/qsp";
	static String pass="ROOT";
	static String user="postgres";
	static {
		try {
			//1st step
			Class.forName("org.postgresql.Driver");
			//2nd step
			con=DriverManager.getConnection(url,user,pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insert(Employee e) {
		try {
			//3rd step
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
			// setting the value to delimiter 
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setDouble(3, e.getSal());
			//4th step
			ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static boolean updateNameById(int id,String name) {
		Employee emp=fetchById(id);
		if(emp.getName() != null) {
			try {
				//3rd step
				PreparedStatement ps=con.prepareStatement("update employee set name=? where id=?");
				ps.setString(1, name);
				ps.setInt(2, id);
				//4th step
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}else {
			return false;
		}
	}
	public static Employee fetchById(int id) {
		Employee e=new Employee();
		try {
			//3rd step
			PreparedStatement ps=con.prepareStatement("select * from employee where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setSal(rs.getDouble("sal"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return e;
	}
	public static boolean deleteById(int id) {
		Employee e=fetchById(id);
		if(e.getName() != null) {
			try {
				//3rd step
				PreparedStatement ps=con.prepareStatement("delete from employee where id=?");
				ps.setInt(1, id);
				//4th step
				ps.executeUpdate();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return true;
		}else {
			return false;
		}
	}
	public static List<Employee> fetchAll(){
		List<Employee> li=new ArrayList<Employee>();
		try {
			// 3rd step
			PreparedStatement ps=con.prepareStatement("select * from employee");
			//4th step
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSal(rs.getDouble("sal"));
				li.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return li;
	}
	public static void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
