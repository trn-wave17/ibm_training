package com.ibm.training.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Files - Secondary Storage
 * Process - RAM
 * Channel - RAM-Seconday storage(Stream) - Source+Channel - Stream
 * Byte Stream - 10000101
 * Character Stream - Unicode - 16 bits - 2 bytes
 * 
 * 
 */
public class FileHandling {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		/*
		 * File file = new
		 * File("C:\\Users\\Divyansh\\eclipse-workspace\\JSDTrainingIBM\\test.txt");
		 * System.out.println(file.getName());
		 * System.out.println(file.getAbsolutePath());
		 * System.out.println(file.canWrite()); System.out.println(file.exists());
		 * if(!file.exists()) { file.createNewFile(); } file.delete();
		 */
		String str = "Welcome";
		String str1 = " Back";
		/*
		 * try(FileOutputStream fos = new FileOutputStream(
		 * "C:\\Users\\Divyansh\\eclipse-workspace\\JSDTrainingIBM\\test.txt")){
		 * //char[] ch = str1.toCharArray(); byte[] data = str.getBytes();
		 * fos.write(data); }
		 */

		byte[] data = str.getBytes();

		List<FileOutputStream> fos = new ArrayList<>();

		for (int i = 1; i <= 100000; i++) {
			fos.add(new FileOutputStream(
					String.format("C:\\Users\\Divyansh\\eclipse-workspace\\JSDTrainingIBM\\files\\test%s.txt", i)));
		}

		for (FileOutputStream fos1 : fos) {
			fos1.write(data);
		}

		List<FileInputStream> fis = new ArrayList<>();
		for (int i = 1; i <= 100000; i++) {
			fis.add(new FileInputStream(String.format(".\\files\\test%s.txt", i)));
		}
		int ch,i=1;
		for (FileInputStream fis1 : fis) {
			//System.out.print(i+": ");
			while((ch=fis1.read())!=-1) { 
				//System.out.print((char)ch); 
			}
			i++;
			//System.out.println();
		}
		i=1;
		for (FileOutputStream fos1 : fos) {
			System.out.println(i+": "+fos1.getChannel().isOpen());
			i++;
		}
		i=1;
		for (FileInputStream fis1 : fis) {
			System.out.println(i+": "+fis1.getChannel().isOpen());
			i++;
		}
		System.out.println();
		/*
		 * int ch=0;
		 * 
		 * while((ch=fis.read())!=-1 || true) { System.out.print((char)ch); }
		 * 
		 * do { ch = fis.read(); System.out.print((char)ch); } while(ch!=-1);
		 * fis.close();
		 */

		while(true);
		// TODO Auto-generated method stub

	}

}
