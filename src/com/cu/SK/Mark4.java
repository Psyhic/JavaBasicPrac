package com.cu.SK;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Mark4 {
	public static void main(String[] args) {
		//18 - 05 - 2020
		//IF ELSE IF Statement
		//Write a program to assign GRADE to the student based on what he scored in the exam.
		int score  = 18;
		char grade;
		if (score >= 90){
			grade = 'A';
		}else if (score >= 80){
			grade = 'B';
		}else if (score >= 70){
			grade = 'C';
		}else {
			grade = 'F';
		}
		System.out.println("Grade : " + grade);

		//Switch Statement
		switch (grade){
			case 'A' :
				System.out.println("Outstanding Score");
				break;
			case 'B' :
				System.out.println("Very nice Score");
				break;
			case 'C' :
				System.out.println("Average Score");
				break;
			case 'F' :
				System.out.println("You have failed");
				break;
			default :
				System.out.println("Invalid Grade");
		}

		//Practise of first module
		//First question taking user as a input
		String name;
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		System.out.println( "Hey," + name + " its my birthday party this weekend and you are invited to the party at my place.");

		//Second question swapping numbers
		int a , b , x ;
		System.out.println("Enter first number: ");
		a = scanner.nextInt();
		System.out.println("Enter second number: ");
		b = scanner.nextInt();
		x = a;
		a = b;
		b = x;
		System.out.println("After swapping numbers are " + a +" and " + b);

		//Third question printing date and time of local computer
		LocalDateTime current = LocalDateTime.now();//This is predefined in java
		System.out.println("Current date and time is : " + current);

		//Fourth question highest bidding code in singe line
		int bid1,bid2,bid3,temp,result,real;
		System.out.println("Enter first bidding value : ");
		bid1 = scanner.nextInt();
		System.out.println("Enter second bidding value : ");
		bid2 = scanner.nextInt();
		System.out.println("Enter third bidding value : ");
		bid3 = scanner.nextInt();
		temp = bid1 > bid2 ? bid1 : bid2;
		result = bid2 > temp ? bid2 : temp;
		real = temp > bid3 ? temp : bid3;
		System.out.println("Highest bid : " + real);
	}
}
