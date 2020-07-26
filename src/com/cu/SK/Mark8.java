package com.cu.SK;

public class Mark8 {
	public static void main(String[] args) {
		//22 - 05 - 2020
		//Arrays in Java-Store at - 0    1    2    3  ----> Length of Array
		int[] myFirstArray =      {10 , 20 , 13 , 21};
		int sum = 0;
		for (int i = 0; i < myFirstArray.length; i++){
			sum += myFirstArray[i];
			System.out.println(myFirstArray[i]);
		}
		System.out.println("Sum of the first array : " + sum);

		//WAP to get the sum of numbers in the array
		float[] mySecondArray = new float[3];
		float sumOfArray = 0;
		mySecondArray[0] = 45.7f;
		mySecondArray[1] = 23.1f;
		mySecondArray[2] = 12.5f;
		for (float num : mySecondArray) {
			sumOfArray += num;
			System.out.println(num);
		}
		System.out.println("Sum of float array : " + sumOfArray);

		//Two dimensional array
		//int[] first = {2 , 4 , 1 , 5};
		//int[] second = {4 , 6 , 12 , 1};
		//int[] third = {23 , 21 , 45 , 34};
		//int[] fourth = {43 , 25 , 8 , 31};
		//2 - D array is a collection of 1 - D array
		int[][] all = {
				{2 , 4 , 1 , 5} ,
				{4 , 6 , 12 , 1} ,
				{23 , 21 , 45 , 34} ,
				{43 , 25 , 8 , 31}
		};
		for (int row = 0; row < all.length; row++){
			for (int column = 0; column < all[row].length; column++){
				System.out.print(all[row][column] + " ");
			}
			System.out.println();
		}

		//WAP tp add all numbers in 2 - D array
		float addition = 0;
		for (int x = 0; x < all.length; x++){
			for (int j = 0; j < all.length; j++){
				addition += all[x][j];
			}
		}
		System.out.println("Sum of 2-D array : " + addition);

		//String Handling in Java
		char[] stringArray = {'S' , 'a' , 'h' , 'i' , 'l'};
		String stringName = "Sahil"; //Sequence of characters
		System.out.println(stringArray.length);
		System.out.println(stringName.length());

		//At a given location of string
		System.out.println(stringName.charAt(2));

		//To convert string in all uppercase
		System.out.println(stringName.toUpperCase());

		//To convert string in all lowercase
		System.out.println(stringName.toLowerCase());

		//To check string contain that variable or not
		System.out.println(stringName.contains("hi"));

		//Use on concat in string
		System.out.println(stringName.concat(" is phenomenal"));

		//Comparisons between strings
		String first = "Sahil";
		String second = "Internshala";
		System.out.println(stringName == first);
		System.out.println(stringName == second);
		System.out.println(stringName.equals(first));
	}
}
