package com.cu.SK;

public class Mark2 {
	public static void main(String[] args)
	{
		//17 - 05 - 2020
		//Arithmetic Operator
		int r = 18 / 2;
		System.out.println(r);//sout is shortcut for println statement

		float s = (float) 19 / 3;//if we not use this (float) it will take value as integer
		System.out.println(s);

		//Relational Operator
		int a = 2;
		int b = 3;
		boolean r1 = a > b;//false
		boolean r2 = b >= a;//true
		// it goes same for (less than) < and (less than or equal to) <= , (is equal to) == and (not equal to) != .
		System.out.println(r1);
		System.out.println(r2);

		//Assignment Operator
		int n = 20;
		int q = 2;
		n += q;// here n += q is also define as n = n + q
		System.out.println(n);// it can also done for /= , -= , %=

		//Increment Operator and Decrement Operator
		//For Postfix ie first use the value then change
		int nn = 10;
		int mm = nn++;
		//first mm = nn = 10
		//then it increments nn = 11
		System.out.println(mm);
		System.out.println(nn);//Same goes for Decrement

		//For Prefix ie first change and then use the value
		int aa = 10;
		int bb = ++aa;
		//first it increments aa = 11
		//then assigns value to bb = 11 = aa
		System.out.println(aa);
		System.out.println(bb);//Same goes for Decrement
		

	}
}
