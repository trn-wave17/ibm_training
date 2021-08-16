package org.ibm.training;

public class Department {
	String deptName;
	String hod;
	public Department(String deptName, String hod) {
		super();
		this.deptName = deptName;
		this.hod = hod;
	}
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", hod=" + hod + "]";
	}
	
}
