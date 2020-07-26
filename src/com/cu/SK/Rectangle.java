package com.cu.SK;

public class Rectangle{
	//Mark 12
	//01 - 06 - 2020
	public float length;
	public float breath;

	public Rectangle(){
		//It is default constructor with no parameter
		//Constructors have no return type function
		System.out.println("Default constructor happens");
	}

	//Same name with different parameter ie constructor overloading

	public Rectangle(float l , float b){
		//It is a parameterized constructor
		System.out.println("Parameterized constructor happens");
		float a = l * b;
		float p = 2 * (l + b);
		System.out.println(a);
		System.out.println(p);
	}
	public float getArea(){
		float area = length * breath;
		return area;                    //Methods have return type function
	}
	public float getPerimeter(){
		float perimeter = 2 * (length + breath);
		return perimeter;
	}

	//Getter and Setter
	private float x;
	private float y;
	public float getX(){    //Getter for length as x
		return x;
	}
	public void setX(float x){     //Setter for length as x
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
}
