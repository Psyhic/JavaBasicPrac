package com.cu.SK;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mark15 {
	public static void main(String[] args) {
		//04 - 06 - 2020
		//File Handling in Java
		//Write Data
		String data = "This is file handling.";
		try{
			FileOutputStream fos = new FileOutputStream("fileHandling.txt");
			byte[] byteData = data.getBytes();
			fos.write(byteData);
			fos.close();
		} catch (IOException ex){
			System.out.println(ex);
		}

		//Read Data
		try {
			FileInputStream fis = new FileInputStream("fileHandling.txt");
			int i = 0;
			while((i = fis.read()) != -1){
				System.out.print((char) i);
			}
			fis.close();
		} catch (IOException x){
			System.out.println(x);
		}
	}
}
