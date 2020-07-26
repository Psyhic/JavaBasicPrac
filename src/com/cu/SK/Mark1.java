package com.cu.SK;

import java.util.Scanner;

public class Mark1 {

    public static void main(String[] args) {
	// write your code here
        //DATE = 16 - 05 - 2020
        System.out.println("My name is Sahil.Hello internshala");
        System.out.println("hello 2.0");
        System.out.println(20-2);//taken as a math equation and not as text

        String name="India";
        int population=13265700;
        float populationDensity=393.0f;
        double GDP=2.454;
        char currency='\u20B9'; //for rupee sign
        boolean isSecular=true;
        System.out.print(name + " has a population of " + population + " and density of " + populationDensity + " per square kilometer" + " and GDP of " + GDP + " and currency is " + currency);
        System.out.println(" and India is a secular country ie " + isSecular);

        //implicit conversion
        int radius=1811;
        double newRadius=radius;
        System.out.println(newRadius);
        //explicit conversion
        double value=1811.99;
        int newValue = (int) value;
        System.out.println(newValue);//conversion also depends on range of values of data types also long,double,float requires suffix

        //USER INPUT METHOD
        String nname;
        int rank;
        float storage;
        char dollar;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your country name: ");
        nname = scanner.nextLine();

        System.out.println("Enter your rank: ");
        rank = scanner.nextInt();

        System.out.println("Enter storage capacity: ");
        storage = scanner.nextFloat();

        System.out.println("Enter currency: ");
        dollar = scanner.next().charAt(0);

        System.out.println("Your country name is : " + nname);
        System.out.println("Your rank is : " + rank);
        System.out.println("Storage capacity : " + storage);
        System.out.println("Currency : " + dollar);

        scanner.close();

    }
}
