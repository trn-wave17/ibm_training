package com.ibm.training.java8;

import java.util.Arrays;
import java.util.List;

class Customer{
	String name;
	String emailId;
	List<String> contactNo;
	public Customer(String name, String emailId, List<String> contactNo) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.contactNo = contactNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<String> getContactNo() {
		return contactNo;
	}
	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}
	
	
}

public class Dataset {
	static Customer[] customers = {
			new Customer("A","A@gmail.com",Arrays.asList("1234","2345")),
			new Customer("B","B@gmail.com",Arrays.asList("3456","4567")),
			new Customer("C","C@gmail.com",Arrays.asList("5678","6789"))
	};

}
