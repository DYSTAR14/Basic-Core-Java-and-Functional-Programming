package com.blz.basic_core_programs.evenodd;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(num<0) {
			System.out.println("It's odd Number");
		}
		else {
			System.out.println("It's Even Number");
		}
			
	}

}
