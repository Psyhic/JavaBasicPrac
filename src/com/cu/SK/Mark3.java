package com.cu.SK;

public class Mark3 {
	public static void main(String[] args) {
		//18 - 05 - 2020
		//Conditional Statement
		//IF - ELSE
		boolean isSecular = true;
		if (isSecular){
			System.out.println("India is a secular country");// When boolean is true
		} else {
			System.out.println("India is not a secular country");//When boolean is not true
		}

		//Ternary Operator condition ? Exp1 : Exp2
		String msg = isSecular ? "India is a secular country" : "India is not a secular country";
		System.out.println(msg);// Exp1 = true and Exp2 = false
	}
}
