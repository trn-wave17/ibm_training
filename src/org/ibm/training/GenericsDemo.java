package org.ibm.training;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class ABC{
	int i;
	String str;
	public ABC(int i, String str) {
		super();
		this.i = i;
		this.str = str;
	}
	@Override
	public String toString() {
		return "ABC [i=" + i + ", str=" + str + "]";
	}
	
}

class DEF extends ABC {
	int j;
	int k;
	public DEF(int i, String str, int j, int k) {
		super(i, str);
		this.j = j;
		this.k = k;
	}
	
}
class Container<K extends Number & Serializable>{
	K value;
	
	
	
	public Container(K value) {
		super();
		this.value = value;
	}

	public <T extends Number> void getValue(T value) {
		System.out.println(value);
	}

	public void setValue(K value) {
		this.value = value;
	}
	
	public void printList(List<? extends ABC> list) {
		
	}
	
	public void displayOutput(List<? super ABC> list) {
		for(Object i: list) {
			System.out.println(i);
		}
	}
	
	public K display(K value) {
		System.out.println(value);
		return value;
	}
	
	/*public Number multiplyBy2(Number i) {
		return i*2;
	}*/
	
}


public class GenericsDemo {

	public static void main(String[] args) {
		
		//Container c = new Container(new ABC(10,"abc"));
		// TODO Auto-generated method stub
		
		/*Container<Float, String> container = new Container<Float, String>(10.0f);
		//System.out.println(container.getValue());
		container.display("def");
		Container<String, ABC> container1 = new Container<String, ABC>("abc");
		//System.out.println(container1.getValue());
		container1.display(new ABC(11, "mno"));
		Container<ABC, Integer> container2 = new Container<ABC, Integer>(new ABC(10, "xyz"));
		//System.out.println(container2.getValue());
		container2.display(100);
		//System.out.println(container.multiplyBy2(20.0));*/
		
		Container<Float> container = new Container<Float>(10.0f);
		Container<Integer> container1 = new Container<Integer>(10);
		List<ABC> list = new ArrayList<>();
		list.add(new ABC(10,"abc"));
		list.add(new ABC(11,"xyz"));
		container1.displayOutput(list);
		List<Object> list1 = new ArrayList();
		list1.add(new DEF(10,"ABC",10,20));
		list1.add(new DEF(11,"XYZ",20,30));
		container1.displayOutput(list1);
		List<DEF> list2 = new ArrayList();
		list2.add(new DEF(10,"ABC",10,20));
		list2.add(new DEF(11,"XYZ",20,30));
		//container1.displayOutput(list1);
		container1.printList(list2);
	//	container1.displayOutput(list1);
		

	}

}
