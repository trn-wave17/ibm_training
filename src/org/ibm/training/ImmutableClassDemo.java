package org.ibm.training;

final class SchoolStudent{
	private final String rollNo;//Encapsulation - bundling data and methods(work on data) - binding data with methods
    private final Department department;//has-a relationship-Aggregation
	private final String branch = "PCM";
	public SchoolStudent(String rollNo, Department department) {
		super();
		this.rollNo = rollNo;
		this.department = new Department(null, null);
	}

	public String getRollNo() {
		//Logic to check the validity of the request
		return rollNo;
	}

	public Department getDepartment() {
		return department;
	}
}

/*
 * class CMSSchoolStudent extends SchoolStudent{ String rollNo = "11"; public
 * CMSSchoolStudent(String rollNo, Department department) { super(rollNo,
 * department); // TODO Auto-generated constructor stub } public String
 * getRollNo() { return rollNo; }
 * 
 * }
 */



public class ImmutableClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolStudent student = new SchoolStudent("10", new Department("PCM", "XYZ"));
		//student.rollNo = "12";
		//SchoolStudent student = new SchoolStudent("10", new Department("PCM", "XYZ"));
		System.out.println(student.getRollNo()+" "+student.getDepartment());

	}

}
