package Inheritance;

import Inheritance.emp.Employee;
import Inheritance.emp.WageEmp;
import Inheritance.emp.mgr.Manager;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */
//class contains main method to call the methods use in inheritance
public class InheritanceMain {

	public static void main(String[] args) {
		
		Employee emp=new Employee(101,"Vaibhav",30000);
		emp.display();
		//emp.toString();
		
		System.out.println("****************************************");
		
		Manager m=new Manager();
		m.showIncentives();
		m.display();
		//m.toString();
		
		System.out.println("****************************************");
		
		Manager m1=new Manager(102,"Aarti",25000,5000);
		m1.showIncentives();
		m1.display();
		//m1.toString();
		
		System.out.println("****************************************");
		
		WageEmp we=new WageEmp();
		we.calculateWage();
		we.display();
		//we.toString();
		
		System.out.println("****************************************");
		
		WageEmp we1=new WageEmp(103,"vivek",30000,9,2000);
		we1.calculateWage();
		we1.display();
		//we1.toString();
		
	}

}
