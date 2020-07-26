package com.cu.SK;

import java.util.Scanner;

public class Mark5 {
	public static void main(String[] args) {
		//19 - 05 - 2020
		//Assignment Question
		//Print the ID card of the student
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		String bg;

		System.out.println("Enter name of student : ");
		name = scanner.nextLine();

		System.out.println("Enter age of student : ");
		age = scanner.nextInt();

		System.out.println("Enter blood group of student : ");
		bg = scanner.next();

		System.out.println("--------------------");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Blood group : " + bg);
		System.out.println("--------------------");

		if (age >= 20){
			System.out.println("Your group is RED");
		}else if (age >=15 && age < 20){
			System.out.println("Your group is BLUE");
		} else {
			System.out.println("Your group is YELLOW");
		}
		System.out.println("--------------------");
	}
}
