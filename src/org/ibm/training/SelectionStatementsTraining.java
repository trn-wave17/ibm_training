package org.ibm.training;

/**
 * Selection statements
 *if-else
 *switch
 *ternary operator
 */
public class SelectionStatementsTraining {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		int c;
		/*if(a>b)
			c = a;
		else 
			c = b;*/
		
		c = a>b?a:b;
		System.out.println(c);
		//double s = 1.3f;
		/*switch(s) {
		case "abc": System.out.println("1");
		break;
		case "def": System.out.println("2");
		break;
		case "ghi": System.out.println("3");
		break;
		default: System.out.println("Nothing matches");
		}*/
		/*
		 * int num = 10; if(num > 7) { System.out.println("Continue"); }else if(num >=10
		 * ) { System.out.println("Continue with a short break"); }else {
		 * System.out.println("Don't continue"); }
		 */
		
		/*
		 * if(true){
		 * 
		 * } if(true) {
		 * 
		 * } if(true) {
		 * 
		 * }
		 */

	}

}
