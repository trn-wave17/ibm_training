package org.ibm.training;

import java.io.IOException;
import java.io.Serializable;

/*
 * Normal
 * Single abstract method - FUnctional Interface
 * Marker Interface - no method in them for e.x. Serializable
 */
interface ShapeI extends Drawable{
	
	boolean isShapeSymmnetrical = true;
	//void sendEmail(String from, String to, String body, String subject) throws IOException;
	void clear();
	void display();
}

interface Drawable{
	void draw();
}

class RectangleI implements ShapeI,Serializable{

	@Override
	public void draw() {
		System.out.println("Drawing rectangle");// TODO Auto-generated method stub
		
	}
	
	@Override
	public void clear() {
		System.out.println("Clearing rectange");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println(ShapeI.isShapeSymmnetrical);
	}
}

class SquareI implements ShapeI,Drawable,Serializable{

	@Override
	public void draw() {
		System.out.println("Drawing Shape");// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {

		System.out.println("Clearing square");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {

		System.out.println(ShapeI.isShapeSymmnetrical);
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeI shape = new RectangleI();
		shape.draw();
		ShapeI shape1 = new SquareI();
		shape1.draw();
		shape.display();
		shape1.display();
		shape.clear();
		shape1.clear();/*
						 * ShapeI shapeI = new Rectangle(); shapeI.sendEmail(//parametrs);
						 */
	}

}
