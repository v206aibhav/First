package Inheritance.covariant;

import Inheritance.emp.EmployeeData;
import Inheritance.emp.mgr.Manager;
import Inheritance.emp.mgr.ManagerData;
/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */

public class CovariantMain {

	public static void main(String[] args) {
		
		EmployeeData e=new EmployeeData();
		e.getEmployee().display();
		
		System.out.println("******************************");
		
		ManagerData md=new ManagerData();
		Manager m=md.getEmployee();
		m.display();
		m.showIncentives();

	}

}
