package containment;

import containment.emp.Employee;
import containment.date.MyDate;

public class ContainmentMain {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		e.setEmpId(101);
		e.setName("Vaibhav");
		e.setBirthDate(new MyDate());
		
		System.out.println("Employee id : "+e.getEmpId());
		System.out.println("Name : "+e.getName());
		System.out.println("Birth Date : "+e.getBirthDate());
		
		System.out.println(e.toString());
		
		System.out.println("****************************************");
		
		Employee e1=new Employee(102,"Vivek",new MyDate(20,6,1999));
		e1.display();

	}

}
