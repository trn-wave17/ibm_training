package com.ibm.training.datastructures;
/*
 * size
 * enqueue - adding an element to queue
 * dequeue - removing
 * isEmpty
 * isFull
 * display
 */
public class Queue {
	int capacity = 5;
	int front;
	int rear;
	int queue[] = new int[capacity];
	int size;
	
	public void enqueue(int data) {
		if(isFull()) {
			return;
		}
		queue[rear%capacity] = data;
		rear++;
		size++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			return -1;
		}
		int elem = queue[front%capacity];
		front++;
		size--;
		return elem;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public boolean isFull(){
		return size==capacity;
	}
	
	public void display() {
		for(int i= 0; i<size; i++)
			System.out.print(queue[(i+front)%capacity]+" ");
		System.out.println();
		for(int i=0; i<capacity; i++)
			System.out.print(queue[i]+" ");
		System.out.println();
			
	}

}
