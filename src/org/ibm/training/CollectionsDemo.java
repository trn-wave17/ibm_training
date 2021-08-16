package org.ibm.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * collection - concept - we have a collection of data
 * Collection - interface
 * Collections - class
 */
class Emp implements Comparable<Emp>{
	String empId;
	int salary;
	String empName;
	public Emp(String empId, int salary, String empName) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", salary=" + salary + ", empName=" + empName + "]";
	}
	@Override
	public int compareTo(Emp emp) {
		//return this.empName.compareTo(emp.empName);
		return this.salary < emp.salary ? -1 : 1;
		
	}
	
	
	
}

class MyComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.empId.compareTo(o2.empId);
	}
	
}
public class CollectionsDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		/*
		 * List<Integer> collection = new ArrayList<>();//ArrayList, LinkedList
		 * //Collection<Integer> coll1 = new HashSet<>();//HashSet, TreeSet,
		 * LinkedHashSet collection.add(20); collection.add(10); collection.add(30);
		 * collection.add(26);
		 */
		List<Emp> collection = new ArrayList<>();//ArrayList, LinkedList
		//Collection<Integer> coll1 = new HashSet<>();//HashSet, TreeSet, LinkedHashSet
		collection.add(new Emp("3", 50, "C"));
		collection.add(new Emp("1", 150, "B"));
		collection.add(new Emp("4", 25, "A"));
		collection.add(new Emp("2", 75, "D"));
		/*
		 * for(int i=0; i<collection.size();i++) System.out.println(collection.get(i));
		 */
		//List<Integer> list = Collections.emptyList();
		/*
		 * Collections.sort(collection, Collections.reverseOrder());
		 */
		/*Collections.sort(collection);
		Collections.reverse(collection);*/
		Collections.sort(collection, (o1, o2) -> o1.empId.compareTo(o2.empId));
		//Collections.sort(collection, new MyComparator());
		for(Emp i: collection );
			//System.out.println(i);
		
		/*Iterator itr = collection.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		Set<Integer> set = new TreeSet<>();
		/*System.out.println(set.add(100));
		System.out.println(set.add(237));
		System.out.println(set.add(845));
		System.out.println(set.add(653));*/
		
		for(Integer i: set);
			//System.out.println(i);
		
		
		Map<String, String> map = new TreeMap<>();

		map.put("friday", "18");
		map.put("monday", "10");
		map.put("tuesday", "12");
		map.put("wednesday", "14");
		map.put("thursday", "16");
		//System.out.println(map.get("thursday"));
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println(key+" "+map.get(key));
		}
		
		Stack<Integer> stack = new Stack<>(); 
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		int size = stack.size();
		for(int i=1; i<=size;i++) {
			System.out.println(stack.pop());
		}
	}

}
