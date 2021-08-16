package org.ibm.training;

abstract class Shape implements ShapeI{
	boolean isShapeSymmnetrical = false;
	
	public Shape(boolean isShapeSymmnetrical) {
		super();
		this.isShapeSymmnetrical = isShapeSymmnetrical;
	}
	/*void clear() {
		System.out.println("Clearing the shape");
	}
	void display() {
		System.out.println(isShapeSymmnetrical);
	}*/
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}

class Rectangle extends Shape{

	public Rectangle(boolean isShapeSymmnetrical) {
		super(isShapeSymmnetrical);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("Drawing rectangle");// TODO Auto-generated method stub
		
	}

	/*@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	/*@Override
	void clear() {
		System.out.println("Clearing rectange diagonally");
	}*/
}

class Square extends Shape{

	public Square(boolean isShapeSymmnetrical) {
		super(isShapeSymmnetrical);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("Drawing Shape");// TODO Auto-generated method stub
		
	}

	/*@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}*/
	
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Rectangle(false);
		shape.draw();
		Shape shape1 = new Square(true);
		shape1.draw();
		shape.display();
		shape1.display();
		shape.clear();
		shape1.clear();

	}

}
