package org.ibm.training;

class Employee{
	public String id;
    public int salary;
	public static String ceo;
	
	static {
		String ceo = EmployeeUtility.getCeo();
		//some changes required in format
		//ceo = ceo + "\sCEO";
		Employee.ceo  = ceo;
		System.out.println(ceo);
	}
	
	void work() {
		
	}
	static void fillTimeSheet() {
		
	}
	//Constructor Overloading
	public Employee() {
		id = "Unassigned";
		salary = -1;
	}
	
	static {
		ceo = "XYZ";
	}
	public Employee(String id) {
		this.id = id;
	}
	public Employee(int salary) {
		this.salary = salary;
	}
	public Employee(String id, int salary) {
		this.id = id;
		this.salary = salary;
	}
	
	
	
}

public class EmployeeService {

	public static void main(String[] args) {
		Employee emp;
		emp = new Employee("100", 5000);
		System.out.println(String.format("%s %s %s", emp.id, emp.salary, emp.ceo));
		Employee emp1 = new Employee("110", 10000);
		System.out.println(String.format("%s %s %s", emp1.id, emp1.salary, emp1.ceo));
		

	}

}
