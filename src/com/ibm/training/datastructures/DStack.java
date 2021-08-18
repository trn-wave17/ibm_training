package com.ibm.training.datastructures;
/*
 * push- - 
 * pop - returns the elements and removes it from stack
 * peek - return the elemnet
 * size
 * isEmpty
 * isFull
 */
public class DStack {
	int capacity = 2;
	int[] stack = new int[capacity];
	int top = 0;
	
	private void expand() {
		capacity*=2;
		int[] newStack = new int[capacity];
		for(int i=0; i<size();i++) {
			newStack[i] = stack[i];
		}
		stack = newStack;
	}
	
	private void contract() {
		capacity/=2;
		int[] newStack = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, size());
		stack = newStack;
	}
	
	public void push(int data) {
		if(size()==capacity) {
			expand();
		}
		stack[top] = data;
		top++;
	}
	
	public int peek() {
		return stack[top-1];
	}
	
	public int pop() {
		if(size()<=(capacity/2)/2) {
			contract();
		}
		int elem =  stack[top-1];
		stack[top-1] = 0;
		top--;
		return elem;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public boolean isFull() {
		return top == capacity;
	}
	
	public void display() {
		for(int i=0; i<capacity; i++)
			System.out.print(stack[i]+" ");
		System.out.println();
	}
}
