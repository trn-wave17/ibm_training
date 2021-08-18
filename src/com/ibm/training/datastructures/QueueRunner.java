package com.ibm.training.datastructures;

public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		queue.display();
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		queue.display();
		
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		
		queue.display();
		
		
	}

}
