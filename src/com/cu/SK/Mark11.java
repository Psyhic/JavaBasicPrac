package com.cu.SK;

import java.util.Scanner;

public class Mark11 {
	public static void main(String[] args) {
		//25 - 05 - 2020
		//Assignment - 2
		//Tax Calculator
		System.out.println("Tax Calculator Application");
		System.out.println("---------WELCOME!---------");
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Enter total person count : ");
		number = scanner.nextInt();
		String[] personCount = new String[number];
		long[] income = new long[number];
		for (int i = 0; i < number ; i++){
			System.out.println("Enter Name " + (i + 1 )+ " : ");
			personCount[i] = scanner.next();
			System.out.println("Enter " + personCount[i] + " ' s Annual Income " + " : ");
			income[i] = scanner.nextLong();
		}
		calculateText(personCount , income);// 
	}

	public static void calculateText(String personCount[] , long income[]) {
		System.out.println("Names with liable taxes");
		System.out.println("-----------------------");
		for (int i = 0; i < personCount.length; i++){
			if (income[i] >= 300000){
				System.out.println(personCount[i] +" : "+ '\u20B9' + " " + (income[i]*20)/100);
			}else if (income[i] < 300000 && income[i] > 100000){
				System.out.println(personCount[i] +" : "+ '\u20B9' + " " + (income[i]*10)/100);
			}else {
				System.out.println(personCount[i] +" : "+ '\u20B9' + " " + 0);
			}
		}
	}
}
