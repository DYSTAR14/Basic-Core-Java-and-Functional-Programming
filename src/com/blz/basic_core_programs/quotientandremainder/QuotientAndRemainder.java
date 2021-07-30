package com.blz.basic_core_programs.quotientandremainder;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dividend");
		int divident=sc.nextInt();
		System.out.println("Enter Divisor");
		int divisor=sc.nextInt();
		if (divisor==0) {
			System.out.println("Error\nDivisor not supposed to 0 ");
		}
		else {
			System.out.println("Dividend : "+divident+" Divisor : "+divisor);
			int quotient=divident/divisor;
			int remainder=divident%divisor;
			System.out.println("Quotient = " + quotient);
		    System.out.println("Remainder = " + remainder);
		}
	}
}
