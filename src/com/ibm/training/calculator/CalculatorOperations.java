package com.ibm.training.calculator;

public enum CalculatorOperations {
	
	ADD(0),SUBTRACT(1),MULTIPLY(2),DIVIDE(3);
	
	int value;
	
	CalculatorOperations(int value) {
		this.value = value;
	}

}
