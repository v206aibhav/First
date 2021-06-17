package Inheritance.emp.mgr;

import Inheritance.emp.Employee;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */
//Derived class to display Manager details
public class Manager extends Employee {
	
	double incentives;
	
	//Default constructor
	public Manager()
	{
		empId=102;
		incentives=5000;
		System.out.println("Defalut constructor of manager");
	}
	
	//Parameterized constructor
	public Manager(int empId, String name, double salary,double incentives) {
		super(empId, name, salary);
		this.incentives=incentives;
		System.out.println("Parameterized constructor of manager");
	}
	//Method to show incentives
	public void showIncentives()
	{
		System.out.println("Incentive : "+incentives);
	}
	
	public void display()
	{
		super.display();
	}
	
	public String toString()
	{
		return super.toString();
	}

}
