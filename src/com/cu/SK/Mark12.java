package com.cu.SK;

public class Mark12 {
	public static void main(String[] args) {
		//01 - 06 - 2020
		//Classes and Objects
		Dog dog1 = new Dog();
		dog1.breed = "Golden Labrador";
		dog1.color = "Golden";
		dog1.size = 30;

		dog1.bark();
		dog1.run();

		System.out.println(dog1.breed);
		System.out.println(dog1.color);
		System.out.println(dog1.size);

		//Assignment Question
		//Area and Perimeter of Rectangle
		Rectangle r1 = new Rectangle();         //Default constructor
		r1.breath = 5.7f;
		r1.length = 10.8f;

		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());

		//Constructors in Java
		Rectangle r2 = new Rectangle(12.1f ,13.4f );        //Parameterized constructor

		//Getter and Setter
		Rectangle r3 = new Rectangle();
		r3.setX(12.4f);
		r3.setY(13.5f);
		System.out.println(r3.getX());
		System.out.println(r3.getY());
	}
}
