package com.ibm.training.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;


public class CalculatorTest {

	Calculator calculator = new Calculator();
	 
	/*
	 * @Before public void setup() { calculator = new Calculator(); }
	 */
	
	/*
	 * @After public void cleanUp() { calculator = null; }
	 */
	
	@ParameterizedTest
	@CsvSource({"2,4,6","2,-1,1","3,-3,0"})
	public void testAddOperation(int num1, int num2, int expected) {
		assertEquals(expected,calculator.add(num1, num2));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {500,450,100,1,1000})
	public void testValidation_Success(int number) {
		assertTrue(calculator.validateData(number));
	}
	
	@Test
	public void testValidation_Failure() {
		assertEquals(false, calculator.validateData(1001));
		assertEquals(false, calculator.validateData(0));
		assertFalse(calculator.validateData(-1));
	}
	
	@ParameterizedTest
	@EnumSource(CalculatorOperations.class)
	public void testCalculatorOperationsRange(CalculatorOperations operation) {
		int opValue = operation.value;
		assertTrue(opValue>=0 && opValue<=3);
	}
	
	
	@ParameterizedTest
	@MethodSource("getDataToTestAdd")
	public void testAdditionUsingMethodSource( int num1, int num2, int expected) {
		assertEquals(expected,calculator.add(num1, num2));
	}
	
	
	public static Stream<Arguments> getDataToTestAdd(){
		return Stream.of(
				Arguments.of(2,4,6),
				Arguments.of(2,-1,1),
				Arguments.of(3,-3,0)
				);
		
	}
	
	@ParameterizedTest
	@MethodSource
	public void testValidationSingleArgument(int number) {
		assertTrue(calculator.validateData(number));
	}
	
	public static Stream<Integer> testValidationSingleArgument() {
		return Stream.of(500,450,100,1,1000);
	}
	
	
}
