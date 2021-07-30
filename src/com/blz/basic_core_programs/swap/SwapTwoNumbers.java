package com.blz.basic_core_programs.swap;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNum=sc.nextInt();
		System.out.println("Enter second number");
		int secondNum=sc.nextInt();
		System.out.println("Before Swap First no."+firstNum+" Second no."+secondNum);
		int temp;
		temp=firstNum;
		firstNum=secondNum;
		secondNum=temp;
		System.out.println("After Swap First no."+firstNum+" Second no."+secondNum);
		
	}

}
