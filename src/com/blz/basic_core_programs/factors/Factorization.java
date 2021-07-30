package com.blz.basic_core_programs.factors;

import java.util.Scanner;

public class Factorization {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (num > 1) {
			System.out.println("PrimeFactor are");
			if (num == 2) {
				System.out.println(num);
			} else {
				for (int i = 2; i <= num / 2; i++) {
					while (num % i == 0) {
						System.out.println(i);
						num /= i;
					}
				}
				if (num > 2)
					System.out.println(num);
			}
		} else {
			System.out.println("It is not have PrimeFactor");
		}

	}

}
