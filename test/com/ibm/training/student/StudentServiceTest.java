package com.ibm.training.student;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentServiceTest {
	
	StudentService studentService = new StudentService();
	 
	

	@Test
	public void testGradeAssignment() {
		Student student = new Student();
		student.setName("ABC");
		int marks[] = {5,6,8,9,10};
		student.setMarks(marks);
		student.setCollege("XYZ");
		studentService.assignGrades(student);
		/* assertEquals('C', studentService.assignGrades(student)); */
		assertEquals("ABC", student.getName());
		assertEquals("XYZ", student.getCollege());
		assertEquals(marks, student.getMarks());
		assertEquals('C', student.getGrade());
		
		
	}

}
