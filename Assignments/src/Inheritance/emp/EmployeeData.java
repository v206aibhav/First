package Inheritance.emp;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */
//class to show covariant object
public class EmployeeData {

	public Employee getEmployee()
	{
		return new Employee();
	}
}
