package com.cu.SK;

import java.util.ArrayList;
import java.util.List;

public class Mark14 {
	public static void main(String[] args) {
		//03 - 06 - 2020
		//Interface in Java
		Remote remote = new Television();
		remote.powerOff();
		remote.powerOn();
		remote.volumeDown();
		remote.volumeUp();

		//Collections in Java
		//Array Lists
		List<String> namesList = new ArrayList();
		namesList.add("Sahil");                     //Index of 0
		namesList.add("Tony");                      //Index of 1
		namesList.add("Jarvis");                    //Index of 2
		System.out.println(namesList.get(2));
		for (String name: namesList                 //For each loop
		     ) {
			System.out.println(name);
		}

		//Create Array List of Employees
		Employee e1 = new Employee("Shane");
		Employee e2 = new Employee("Vince");
		Employee e3 = new Employee("Stephen");
		List<Employee> employeeList = new ArrayList();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		for (Employee employee: employeeList
		     ) {
			System.out.println(employee.yourName);
		}
	}
}

interface Remote{
	abstract public void volumeUp();
	abstract public void volumeDown();
	abstract public void powerOff();
	abstract public void powerOn();
}

class Television implements Remote{

	@Override
	public void volumeUp() {
		System.out.println("Volume is Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Volume is Down");
	}

	@Override
	public void powerOff() {
		System.out.println("Television is Off");
	}

	@Override
	public void powerOn() {
		System.out.println("Television is On");
	}
}

class Employee{
	String yourName;
	public Employee(String yourName){
		this.yourName = yourName;
	}
}
