package com.ibm.training.student;

public interface StudentDao {
	default void persistData(Student student) {
		/*
		 * 
		 * persistence logic
		 */
	}
}
