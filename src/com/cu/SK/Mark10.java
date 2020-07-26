package com.cu.SK;

public class Mark10 {
	public static void main(String[] args) {
		//24 - 05 - 2020
		//Exception Handling in java
		System.out.println("Program starts");
		int[] array = {1 , 2 , 3 , 5};
		System.out.println(array[3]);           //If we exceeds the value more than 3 like 23 it will give exception in java.lang
		System.out.println("Program ends");

		//Try - Catch - Finally
		System.out.println("Use of try , catch , finally function");
		int[] myArray = {10 , 21 , 13 , 18};
		try {
			System.out.println(myArray[27]);    //Exception occurs here
		} catch (ArrayIndexOutOfBoundsException exception){
			//Your code can be written here but... its optional
			System.out.println(exception);
		}finally {
			System.out.println("This will executed no matter what");   //Also optional
		}
		System.out.println("Ending");
	}
}