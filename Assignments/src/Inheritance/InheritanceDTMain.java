package Inheritance;

import Inheritance.emp.Employee;
import Inheritance.emp.WageEmp;
import Inheritance.emp.mgr.Manager;

public class InheritanceDTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee ob;
		
		ob=new Manager(102,"Vaibhav",25000,5000);
		ob.display();
		((Manager)ob).showIncentives();
		
		System.out.println("*********************************");
		
		ob=new WageEmp();
		ob.display();
		WageEmp we=(WageEmp)ob;
		we.calculateWage();
		//((WageEmp)ob).calculateWage();

	}

}
