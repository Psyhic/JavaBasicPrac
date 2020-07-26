package com.cu.SK;

public class Mark9 {
	public static void main(String[] args) {
		//23 - 05 - 2020
		//Methods in java
		sayHello();//We have call sayHello before in main file for execution

		//WAP to find the simple interest ie SI = P * R * T / 100
		//User - 1 principal : 1000; rateOfInterest : 8.7f; timePeriod : 2

		calculateSimpleInterest(1000, 8.7f, 2);
		//User - 1 principal : 13000; rateOfInterest : 10.7f; timePeriod : 4

		calculateSimpleInterest(13000, 10.7f, 4 );

		//For sum statement
		double sum = addition(10 ,20);  //Method 1
		System.out.println("Sum is : " + sum);

		//Method overloading from above addition
		addition();                          //Method 2
	}
	public static void sayHello(){
		System.out.println("Hello");//declare after call
	}

	//Simple Interest
	public static void calculateSimpleInterest(int principal , float rateOfInterest , int timePeriod){
		double si = principal * rateOfInterest * timePeriod / 100 ;
		System.out.println(si);
	}

	//WAP to print sum of two values and sum to print the value from method
	public static double addition(int a , int b){            //Method 1
		double sum = a + b;
		return sum;
	}

	//Method overloading but with different parameter
	public static void addition(){                           //Method 2
		double sum = 3 + 5;
		System.out.println("Sum is : " + sum);
	}
}
