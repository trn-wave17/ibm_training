package com.ibm.training.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedFileHandling {
	
	public static void main(String args[]) throws Exception{
		
		String str = "Welcome\nthis\nis\nfile\nhandling\nclass";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(".\\test.txt"))){
			bw.write(str);
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(".\\test.txt"))){
			String st;
			while((st=br.readLine())!=null) {
				System.out.println(st);
			}
		}
		
		
	}

}
