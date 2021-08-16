package org.ibm.training;

/**
 * @author Divyansh
 *while loop
 *do while
 *for loop
 *initialization, condition, and modification/increment
 *Jump statements - break, continue, return
 *1
 *1 2
 *1 2 3
 *1 2 3 4 
 *1 2 3 4 5
 *
 */
/**
 * * * * * * * *
 **/

public class IterationStatementsDemo {
	
	public static void main(String args[]) {
		L1: for(int i=1; i<=10; i++) {
			System.out.println();
				for(int j=1;j<=i;j++) {
					if(j==3)
						continue L1;
					System.out.print(j+" ");
				}
				
		}
		
		/*i=6;
		do {
			//System.out.println("Hello World - Do While");
			i++;
		}while(i<=5);
	
		for(int j=1;j<=5;j++) {
			//System.out.println("Hello World - For");
		}
		
		for(int k=1; k<=5; k++) {
			for(int l=1; l<=k; l++) {
				System.out.print(l+" ");
			}
			System.out.println();
		}*/
		
	}

}
