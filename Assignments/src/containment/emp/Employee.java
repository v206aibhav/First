package containment.emp;

import containment.date.MyDate;

public class Employee {
	
	private int empId;
	private String name;
	private MyDate birthDate;
	
	public Employee()
	{
		empId=1;
		name="Vaibhav";
		birthDate=new MyDate();
	}
	
	public Employee(int empId,String name,MyDate birthDate)
	{
		this.empId=empId;
		this.name=name;
		this.birthDate=birthDate;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public void display()
	{
		System.out.println(empId+" "+name+" "+birthDate);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	

}
