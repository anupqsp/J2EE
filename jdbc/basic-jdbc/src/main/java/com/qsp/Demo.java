package com.qsp;

public class Demo {
	public static void main(String[] args) {
		try {
			// 1st step
			Class.forName("org.postgresql.Driver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
