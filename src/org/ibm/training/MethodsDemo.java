package org.ibm.training;
//Compile time polymorphism(Method overloading) and run time polymorphism(Method overriding) -
//Varargs
class Calculator{
	public int add(int i, int j) {//public, default, protected - function signature
		return i+j;//Function body
	}
	public int add(int i, int j, int k) {
		return i+j+k;
	}
	public int add(int ... arr) {//Varargs
		int sum = 0;
		for(int i: arr) {
			sum+=i;
		}
		return sum;
	}
	public int add(int i, double d) {
		return i+(int)d;
	}
	public int multiply(int i, int j) {
		return i*j;
	}
	public int subtract(int i, int j) {
		return i-j;
	}
}

public class MethodsDemo {
	
	public static void main(String args[]) {
		Calculator obj = new Calculator();
		/*
		 * System.out.println(obj.add(4, 2)); System.out.println(obj.multiply(4, 2));
		 * System.out.println(obj.subtract(4, 2));
		 */
		//1-D array of integers
		int[] arr;
		arr = new int[10];
		int[] arr1 = new int[10];
		int[] arr2 = {5,6,7,8};
		//indexing - 0 to n-1 where n-size
		//arr[0] - memeory where array starts arr+size * index arr+1*4
		for(int i=0; i<arr2.length; i++) {
			//System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for(Integer i: arr2) {
			//System.out.print(i+" ");
		}
		String string = "This is an array";
		String[] str = string.split("\s");
		for(String s: str) {
			//System.out.println(s);
		}
		
		//2-D array
		/* 1 2 3 4
		 * 5 6 7 8
		 * 1 2 3 4
		 */
		int[][] arr3 = new int[3][4];
		int[] ar1 = {1,2};
		int[] ar2 = {5,6,7,8};
		int[] ar3 = {1,2,3};
		int[][] arr4 = {
				ar1,ar2,ar3
		};
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
			//System.out.print(arr4[i][j]+" ");
			}
			//System.out.println();
		}
		for(int[] ar: arr4) {
			for(int i1: ar) {
				System.out.print(i1+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
