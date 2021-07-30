package com.blz.basic_core_programs.flipcoin;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totalOfRandomValue=0,tailWon=0,headWon=0;
		System.out.println("Enter Number to Flip Coin (Positive Numbers)");
		int numOfFlipCoin=sc.nextInt();
		if (numOfFlipCoin<0) {
			System.out.println("Error (Please Provide Positive Integer)");
		}
		else {
			for(int i=1;i<=numOfFlipCoin;i++) {
				float randValue=(float) (Math.random()%1);
				totalOfRandomValue+=1;
				if (randValue<0.5) {
					tailWon+=1;
				}
				else {
					headWon+=1;
				}
			}
			System.out.println(totalOfRandomValue);
			float tailPercent=(tailWon*100)/totalOfRandomValue;
			float headPercent=(headWon*100)/totalOfRandomValue;
			System.out.println("Tail Won : "+tailWon+" Time Percent : "+tailPercent+"\nHead Won : "+headWon+" Time Percent : "+headPercent);
		}
		
	}
}
