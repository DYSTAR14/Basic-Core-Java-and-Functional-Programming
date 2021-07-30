package com.blz.functional_programs.array_2d;

import java.util.Scanner;

public class Array2D {
	private static final Scanner SC = new Scanner(System.in);

	public static void Array2dPrint(double array2d[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(array2d[i][j] + " | ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, col;
		System.out.println("Enter Row Number");
		row = SC.nextInt();
		System.out.println("Enter Column Number");
		col = SC.nextInt();
		double array[][] = new double[row][col];
		System.out.println("Enter Value");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array[i][j] = SC.nextDouble();
			}
		}
		Array2dPrint(array, row, col);
	}

}
