package com.ibm.training.datastructures;
//add(data)
//add(index, data)
//delete(index)
//size
//display
public class LinkedList<T> {
	Node<T> head;
	int size;

	
	private Node<T> createNode(T data) {
		return new Node<T>(data);
	}
	
	public void add(T data) {
		Node<T> newNode = createNode(data);
		if(head==null) {
			head = newNode;
		} else {
			Node<T> temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		size++;
	}
	
	public void addInBeginning(Node<T> node) {
		node.next = head;
		head = node;
	}
	
	public void add(int index, T data) {
		Node<T> newNode = createNode(data);
		Node<T> temp = head;
		if(index==0) {
			addInBeginning(newNode);
		}else {
			for(int i=0;i<index-1;i++)
				temp = temp.next;
			newNode.next = temp.next;
			temp.next = newNode;
		}
		size++;
		
	}
	
	public void delete(int index) {
		Node<T> temp = head;
		Node<T> delNode = null;
		if(index==0) {
			delNode = head;
			head = head.next;
		} else {
			for(int i=0;i<index-1;i++)
				temp = temp.next;
			delNode = temp.next;
			temp.next = delNode.next;
		}

		delNode = null;
		size--;
	}
	
	public void display() {
		Node<T> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public int size() {
		return size;
	}

}
