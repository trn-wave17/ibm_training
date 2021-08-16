package com.ibm.training.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Divyansh\\eclipse-workspace\\JSDTrainingIBM\\test.txt");
		System.out.println(file.canWrite());
		System.out.println(file.exists());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());

		file.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(file);
		String str = "Welcome";
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++)
			fos.write(ch[i]);
		fos.close();
		FileInputStream fis = new FileInputStream(file);
		int ch1;
		while((ch1=fis.read())!=-1) {
			System.out.print((char) ch1);
		}
		
		fis.close();
		file.delete();
		System.out.println();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(".\\test1.txt"));
		bw.write(str);
		bw.close();
		String str1;
		BufferedReader br = new BufferedReader(new FileReader(".\\test1.txt"));
		while((str1=br.readLine())!=null) {
			System.out.println(str1);
		}
		br.close();
		
		// TODO Auto-generated method stub

	}

}
