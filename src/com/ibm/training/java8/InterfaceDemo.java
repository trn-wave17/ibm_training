package com.ibm.training.java8;

interface Phone{
	void call();//abstract functions
	void message();//abstract function
	
	default void clickPhotos() {//default method
		System.out.println("Capturing photo");
	}
	
	static void startTimer() {
		System.out.println("Starting timer");
	}
}

interface PhoneI{
	void call();
	void message();
	
	default void clickPhotos() {
		System.out.println("Capturing photo from an Application");
	}
	
	static void startTimer() {
		System.out.println("Starting timer");
	}
}

class AndroidPhone implements Phone,PhoneI{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling");
	}

	@Override
	public void message() {
		System.out.println("Sending message");
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void clickPhotos() {
		System.out.println("Clicking photo from android");
	}
	
	public void startTimer() {
		Phone.startTimer();
	}
	
}

class IOSPhone implements Phone,PhoneI{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling from IOS");
	}

	@Override
	public void message() {
		System.out.println("Sending message from IOS");
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void clickPhotos() {
		System.out.println("Clicking photo from IOS");
	}
	
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AndroidPhone androidPhone = new AndroidPhone();
		androidPhone.call();
		androidPhone.message();
		androidPhone.clickPhotos();
		androidPhone.startTimer();
		Phone iosPhone = new IOSPhone();
		iosPhone.call();
		iosPhone.message();
		iosPhone.clickPhotos();


	}

}
