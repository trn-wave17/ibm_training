package com.ibm.training.datastructures;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);//0
		list.add(2);//1
		list.add(4);//2
		list.add(5);//3
		list.add(2, 3);
		list.add(5,6);
		list.add(0,0);
		list.display();
		System.out.println("Size: "+list.size());
		list.delete(0);
		list.display();
		System.out.println("Size: "+list.size());
		
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("A");//0
		list1.add("B");//1
		list1.display();
		System.out.println("Size: "+list1.size());

	}

}
