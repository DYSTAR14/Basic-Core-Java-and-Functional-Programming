package com.blz.basic_core_programs.largestnumber;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("Enter First Number : ");
		num1=sc.nextInt();
		System.out.print("Enter Second Number : ");
		num2=sc.nextInt();
		System.out.print("Enter Third Number : ");
		num3=sc.nextInt();
		if(num1>=num2 || num1>=num3) {
			System.out.println(num1+" is largest number");
		}
		else if(num2>=num1 || num2>=num3) {
			System.out.println(num2+" is largest number");
		}
		else {
			System.out.println(num3+" is largest number");
		}
		
	}
}
