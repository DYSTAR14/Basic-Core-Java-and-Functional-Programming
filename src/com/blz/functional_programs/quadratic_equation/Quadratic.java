package com.blz.functional_programs.quadratic_equation;

import java.util.Scanner;

public class Quadratic {

	public static void quadraticRoots(int a,int b,int c) {
		int delta=b*b-4*a*c;
		if(delta==0) {
			double rootX = -b / (2 * a);  
			System.out.println("Root are : "+String.format("%.2f",rootX));
		}
		else if(delta>0) {
			double rootX1=(-b+Math.sqrt(delta))/(2*a);
			double rootX2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("Root are : "+String.format("%.2f", rootX2)+" and "+String.format("%.2f", +rootX2));
		}
		else if(delta<0) {
			System.out.println("Roots are not real.");  
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		quadraticRoots(a, b, c);
	}

}
