package Inheritance.emp;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */
//class to calculate wages of an employee and show details
public class WageEmp extends Employee{
	
	private int noOfHours;
	private float ratePerHour;
	
	//Default constructor
	public WageEmp()
	{
		noOfHours=8;
		ratePerHour=200f;
		System.out.println("Default constructor of WageEmp");
	}
	
	//Parameterized constructor
	public WageEmp(int empId, String name, double salary,int noOfHours,float ratePerHour) {
		super(empId, name, salary);
		this.noOfHours=noOfHours;
		this.ratePerHour=ratePerHour;
		System.out.println("Parameterized constructor of Wage class");
	}
	//Method to calculate wages 
	public void calculateWage()
	{
		System.out.println("Daily Wage : " +(noOfHours*ratePerHour));
	}
	
	public void display()
	{
		super.display();
		System.out.println("Hours : "+noOfHours+
						   "\nRate : "+ratePerHour);
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	

}
