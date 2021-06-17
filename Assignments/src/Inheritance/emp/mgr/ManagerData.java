package Inheritance.emp.mgr;

import Inheritance.emp.EmployeeData;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */
//class to show covarient object
public class ManagerData extends EmployeeData{
	
	public Manager getEmployee()
	{
		return new Manager();
		
	}

}
