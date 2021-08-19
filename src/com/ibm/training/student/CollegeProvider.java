package com.ibm.training.student;

import java.util.Map;

class College{
	private String name;
	private String fullName;
	public College(String name, String fullName) {
		super();
		this.name = name;
		this.fullName = fullName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}

public class CollegeProvider {
	
	static Map<String, College> map = Map.of("XYZ", new College("XYZ","Xaviers YZ College"));

}
