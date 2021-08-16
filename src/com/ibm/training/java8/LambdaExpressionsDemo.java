package com.ibm.training.java8;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface A{
	void display();
}

/*class ABC implements A{

	@Override
	public void display() {
		System.out.println("This is the output to your funct interface");
	}
	
	
}*/

class ABC{
	public static void displayString() {
		System.out.println("This is the output to your funct interface");
	}
	
	public void display1() {
		System.out.println("This is the output to your funct interface");
	}
}

public class LambdaExpressionsDemo {

	public static void main(String[] args) {
		/*
		 * A obj1 = new A() {
		 * 
		 * @Override public void display() { System.out.println("Displaying");// TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * };
		 */
		A obj = ABC::displayString;
		
		ABC obj1 = new ABC();
		A obj2 = obj1::display1;
		obj2.display();
		//obj.display();
		// TODO Auto-generated method stub
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		for(int i=0; i<list.size();i++);//External loops
			//System.out.println(list.get(i));
			
		for(int j: list);//External loop
			//System.out.println(i);
		
		list.forEach(System.out::println);
		
		//list.forEach(t -> System.out.println(t));

	}

}
