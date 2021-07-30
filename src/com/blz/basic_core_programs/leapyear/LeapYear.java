package com.blz.basic_core_programs.leapyear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for leap Year (4 digit No.)");
		int num = sc.nextInt();
		if (String.valueOf(num).length() == 4) {
			System.out.println(num);
			if ((num % 4 == 0) && (num % 100 != 0) || (num % 400 == 0)) {
				System.out.println("It is a Leap Year");
			} else {
				System.out.println("It is not a Leap Year");
			}
		} else {
			System.out.println("Error (Please enter 4 digit number)");
		}

	}

}
