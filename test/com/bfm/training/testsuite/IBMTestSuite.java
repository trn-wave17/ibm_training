package com.bfm.training.testsuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import com.ibm.training.calculator.CalculatorTest;
import com.ibm.training.student.StudentServiceTest;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.ibm.training.calculator","com.ibm.training.string.util","com.ibm.training.student"})
//@SelectPackages({"com.ibm.training.string.util","com.ibm.training.calculator","com.ibm.training.student"})
//@SelectClasses({CalculatorTest.class, StudentServiceTest.class})
//@ExcludePackages({"com.ibm.training.string.util","com.ibm.training.calculator"})
//@IncludePackages("com.ibm.training.calculator")
public class IBMTestSuite {

}
