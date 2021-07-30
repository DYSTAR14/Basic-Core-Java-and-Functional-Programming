package com.blz.basic_core_programs.harmonicnumber;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for nth Harmonic Number");
		int nthValue=sc.nextInt();
		float harmonicValue=0;
		if(nthValue!=0 && nthValue>0) {
			for (Float i = (float) 1; i <=nthValue; i++) {
				harmonicValue=harmonicValue+(float)(1/i);
				System.out.println(harmonicValue);
			}
		}
		else {
			System.out.println("Error (Please Enter value greater then 0)");
		}
		
	}

}
