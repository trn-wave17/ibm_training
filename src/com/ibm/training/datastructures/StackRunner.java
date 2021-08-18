package com.ibm.training.datastructures;

public class StackRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DStack stack = new DStack();
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		
		stack.display();
		
		System.out.println("Is full "+stack.isFull());

		System.out.println("Size: "+stack.size());
		System.out.println("Pop "+stack.pop());
		System.out.println("Pop "+stack.pop());

		System.out.println("Pop "+stack.pop());

		System.out.println("Pop "+stack.pop());
		stack.display();
		System.out.println("Is empty "+stack.isEmpty());
	}

}
