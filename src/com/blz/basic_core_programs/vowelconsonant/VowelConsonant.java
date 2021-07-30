package com.blz.basic_core_programs.vowelconsonant;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		char vowel;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character a-z");
		vowel = sc.next().charAt(0);
		if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
			System.out.println("It's a Vowel");
		} else {
			System.out.println("It's a Consonant");
		}
	}
}
