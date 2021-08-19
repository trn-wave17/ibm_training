package com.ibm.training.student;

public class StudentService {
	
	public void assignGrades(Student student) {
		int marks[] = student.getMarks();
		int sum = 0;
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
		}
		double avg = (double)sum/marks.length;
		char grade;
		if(avg>=9.0)
			grade = 'A';
		else if(avg>=8.0)
			grade = 'B';
		else if(avg>=7.0)
			grade = 'C';
		else
			grade = 'F';
		
		student.setGrade(grade);
		persistStudentInformation(student);
	}
	
	
	public void persistStudentInformation(Student student) {
		College college = CollegeProvider.map.get(student.getCollege());
		student.setCollege(college.getFullName());
		
	}

}
