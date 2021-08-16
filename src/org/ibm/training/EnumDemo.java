package org.ibm.training;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MobilePhone.SAMSUNG.getPrice());
		System.out.println(MobilePhone.APPLE.getPrice());
		System.out.println(MobilePhone.REDMI.getPrice());
		
		System.out.println(MobilePhone.APPLE.name());
		System.out.println(MobilePhone.APPLE.ordinal());
		System.out.println(MobilePhone.SAMSUNG.name());
		System.out.println(MobilePhone.SAMSUNG.ordinal());
		

	}

}
