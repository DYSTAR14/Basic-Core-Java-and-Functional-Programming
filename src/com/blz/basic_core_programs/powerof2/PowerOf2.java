package com.blz.basic_core_programs.powerof2;
public class PowerOf2 {
	public static void main(String args[]) {
		int N=Integer.parseInt(args[0]);
		System.out.println("Your Given Value : "+N);
		for (int i = 0; i < N; i++) {
			System.out.println((int)Math.pow(2, i));
		}
		
	}
}
