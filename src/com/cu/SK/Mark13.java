package com.cu.SK;

public class Mark13 {
	public static void main(String[] args) {
		//02 - 06 - 2020
		//Inheritance in Java
		Lion lion = new Lion();
		lion.name = "Leon";
		lion.color = "Golden";
		lion.bark();
		lion.run();

		Cat cat = new Cat();
		cat.name = "Missy";
		cat.pattern = "White Dots";
		cat.meow();
		cat.run();
	}
}

class Animal{
		String name;
		public void run(){
			System.out.println("Animal is running.");
		}
}

class Lion extends Animal{
		String color;
		public void bark(){
			System.out.println("Guru!");
		}
}

class Cat extends Animal{
		String pattern;
		public void meow(){
			System.out.println("Meow!");
		}
}
