package com.ibm.training.calculator;

public class Calculator {
	
	public int add(int i, int j) {
		return i+j;
	}
	
	public boolean validateData(int num) {
		if(num<=0 || num>1000)
			return false;
		return true;
	}

}
