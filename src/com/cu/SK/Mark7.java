package com.cu.SK;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Mark7 {
	public static void main(String[] args) {
		//21 - 05 - 2020
		//While loop
		//WAP to find out the factorial of a number
		int a;
		long factorial = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for factorial : ");
		a = scanner.nextInt();
		while (a > 0){
			factorial *= a;
			a--;
		}
		System.out.println("Factorial is : " + factorial);

		//Do While loop
		//WAP to add numbers until user enters zero
		double n;
		double result = 0;
		do {
			System.out.println("Enter the number : ");
			n = scanner.nextDouble();
			result += n;
		}while (n != 0);
		System.out.println("The result is : " + result);

		//Practise Question
		//Check weather number is prime or not using both for and while loop
		int i , x , y = 0;
		System.out.println("Enter the number to check : ");
		x = scanner.nextInt();
		for (i = 2; i <= x/2; i++){
			if (x % i == 0){
				y++;
				break;
			}
		}if (y == 0 && x != 1) {
			System.out.println(x + " is prime number");
		}
		else{
			System.out.println(x + " is not a prime number");
		}
	}
}
