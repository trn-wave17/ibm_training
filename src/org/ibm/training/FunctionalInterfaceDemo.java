package org.ibm.training;
/*
 * Comparartor
 * Runnable
 * Callable etc.
 */
@FunctionalInterface
interface A{
	//int add(int i, int j);
	void display(int i, int j);
}

class B{
	void display(A obj) {
		obj.display(10, 20);
	}
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		/*A obj = new A() {

			@Override
			public int add(int i, int j) {
				// TODO Auto-generated method stub
				return i+j;
			}
			
		};*/
		//A obj = (i, j) -> i+j;
		//System.out.println(obj.add(10, 20));
		/*A obj = (i, j) -> System.out.println(i+" "+j);
		obj.display(10, 20);*/
		B obj1 = new B();
		obj1.display((i,j)->System.out.println(i+" "+j));

	}

}
