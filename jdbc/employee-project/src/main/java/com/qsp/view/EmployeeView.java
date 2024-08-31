package com.qsp.view;

import java.util.List;
import java.util.Scanner;

import com.qsp.controller.EmployeeContoller;
import com.qsp.model.Employee;

public class EmployeeView {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("--------welcome---------");
		do {
			System.out.println("1->insert Employee");
			System.out.println("2->update Employee name by Id");
			System.out.println("3->fetch Employee by Id");
			System.out.println("4->delete Employee by Id");
			System.out.println("5->fetch all Employee");
			System.out.println("6->close connection");
			switch (sc.nextInt()) {
			case 1: {
				Employee e = new Employee();
				System.out.println("enter id");
				e.setId(sc.nextInt());
				System.out.println("enter name");
				e.setName(sc.next());
				System.out.println("enter salary");
				e.setSal(sc.nextDouble());
				EmployeeContoller.insert(e);
				System.out.println("inserted--------!");
			}
				break;
			case 2: {
				System.out.println("emter id");
				int id = sc.nextInt();
				System.out.println("enter new name");
				String newName = sc.next();
				boolean b = EmployeeContoller.updateNameById(id, newName);
				if (b) {
					System.out.println("updated---!");
				} else {
					System.out.println("id is not present----!");
				}
			}
				break;
			case 3: {
				System.out.println("enter id");
				Employee e = EmployeeContoller.fetchById(sc.nextInt());
				System.out.println(e);
			}
				break;
			case 4: {
				System.out.println("enter id");
				boolean b = EmployeeContoller.deleteById(sc.nextInt());
				if (b) {
					System.out.println("deleted-------!");
				} else {
					System.out.println("id is not present");
				}
			}
				break;
			case 5: {
				List<Employee> li = EmployeeContoller.fetchAll();
				for (Employee e : li) {
					System.out.println(e);
				}
			}
				break;
			case 6: {
				EmployeeContoller.closeConnection();
				System.out.println("connection is closed");
			}
				break;
			default:
				System.out.println("wrong info");
			}
			System.out.println("enter y to continue");
		} while ("Y".equalsIgnoreCase(sc.next()));
	}
}
