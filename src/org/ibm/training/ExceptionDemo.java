package org.ibm.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {

	public static void main(String[] args) throws IBMException {
		int i,j;
		System.out.println("Enter two numbers");
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int k = 0;
		try {
			int[] arr = null;
			int arrElement = arr[1];
			i = Integer.parseInt(br.readLine());
			j = Integer.parseInt(br.readLine());
			k=i/j;
			System.out.println("In Try block");
			
		} catch(ArithmeticException | NumberFormatException ex) {
			System.out.println("Error");
		} catch(IOException ex) {
			System.out.println("Error in IO");
		} /*
			 * catch(NullPointerException ex) { System.out.println("Error"); }
			 */catch(Exception ex) {
			throw new IBMException("There is a null reference being accessed");
		}
			 
		// TODO Auto-generated method stub

	}

}
