package com.blz.functional_programs.sum_of_three_adds_to_zero;

import java.util.Scanner;

public class SumOfThreeInteger {
	private static final Scanner SC = new Scanner(System.in);
	public static void sumOfThree(int[] array) {
		for (int i = 0; i < array.length-2; i++) {
			for (int j = i+1; j < array.length-1; j++) {
				for (int k = j+1; k < array.length; k++) {
					if(array[i]+array[j]+array[k]==0) {
						System.out.println(array[i]+" "+array[j]+" "+array[k]+" : 0");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		System.out.println("Enter Size of Array");
		N = SC.nextInt();
		System.out.println("Enter Value");
		int array[]=new int[N];		
		for (int i = 0; i < array.length; i++) {
				array[i] = SC.nextInt();
		}
		sumOfThree(array);
		
	}

}
