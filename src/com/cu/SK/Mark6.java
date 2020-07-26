package com.cu.SK;

import java.util.Scanner;

public class Mark6 {
	public static void main(String[] args) {
		//20 - 05 - 2020
		//Iterators in java
		//For loop
		//WAP to find the odd numbers
		int n , i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range for numbers : ");
		i = scanner.nextInt();
		System.out.println("Output is : ");
		for (n = 1; n <= i; n++) {
			if (n % 2 != 0)
				System.out.println(n);
		}
		for (int x = 1; x <= 5; x++)
			System.out.println("Mark6");
	}
}
