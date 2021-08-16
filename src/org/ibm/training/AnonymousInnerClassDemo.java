package org.ibm.training;

abstract class Cloneable{
	abstract Object clone(Object obj);
	abstract void display();
}

/*class AnonymousDemoInner extends Cloneable{
	AnonymousDemoInner(){}
	@Override
	public Object clone(Object obj) {
		return obj;
	}
	
}*/

public class AnonymousInnerClassDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cloneable obj = new Cloneable() {

			@Override
			public Object clone(Object obj) {
				return obj;
			}

			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		Student student = (Student)obj.clone(new Student(null,null,null));
		obj.display();
		

	}

}
