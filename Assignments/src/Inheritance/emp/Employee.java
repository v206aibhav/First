package Inheritance.emp;

/*
 * 	Author: vaibhav.agrawal@stltech.in
 *  Date : 11 june 2021
 *  Version :1.0
 *  Copyright : Sterlite technology ltd.
 *
 * */
//class of all employee in the company
public class Employee {
	
	public int empId;
	public String name;
	public double salary;
	
	//Default constructor
	public Employee()
	{
		empId=101;
		name="Vaibhav";
		salary=40000;
	}
	//Parameterized constructor
	public Employee(int empId, String name) {
		
		this.empId = empId;
		this.name = name;
	}
	//Parameterized constructor
	public Employee(int empId, String name, double salary) {
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		System.out.println("Parameterized constructor of Employee");
	}
	//method to display details of employee
	public void display()
	{
		System.out.println("Emp ID : "+empId+
							"\nName : "+name+
							"\nsalary : "+salary);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	

}
