package org.ibm.training;

interface K{
	void display();
	void show();
}

/*
 * class KImpl implements K{
 * 
 * @Override public void display() {
 * System.out.println("Displaying on screen");// TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void show() {
 * System.out.println("Show on external device");// TODO Auto-generated method
 * stub
 * 
 * } }
 */

public class AnonymousInnerClass1 {
	public static void main(String args[]) {
		
		K obj = new K() {

			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Displaying on screen");
			}

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("Show on external device");
			}
			
		};
		
		obj.display();
		obj.show();
		
	}
}
