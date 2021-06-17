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
//class describe use of instance of keyword
public class RTTIMain {
	
	public static void showEmpInfo(Employee emp)
	{
		emp.display();
		if(emp instanceof Manager)
			((Manager) emp).showIncentives();
		
		if(emp instanceof WageEmp)
			((WageEmp) emp).calculateWage();
	}
	
	public static void main(String args[])
	{
		Manager m=new Manager(102,"Aarti",25000,5000);
		showEmpInfo(m);
		
		System.out.println("**************************************");
		
		WageEmp w=new WageEmp(103,"vivek",30000,9,2000);
		showEmpInfo(w);
	}
	

}
