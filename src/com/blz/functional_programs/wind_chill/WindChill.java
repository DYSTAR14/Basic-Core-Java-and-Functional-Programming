package com.blz.functional_programs.wind_chill;

import java.util.Scanner;

public class WindChill {

	public static void windChill(float temperature,float windSpeed) {
		float windChill=(float) (35.74 + 0.6215*temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16));
		System.out.println("Temperature = " + temperature);
        System.out.println("Wind speed  = " + windSpeed);
        System.out.println("Wind chill  = " + windChill);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temperature=Float.parseFloat(args[0]);
		float windSpeed=Float.parseFloat(args[1]);
		if(temperature<=50 && windSpeed<=120 && windSpeed>=3) {
			windChill(temperature,windSpeed);
		}
		else {
			System.out.println("The formula is not valid if t is larger than 50 in absolute value or if v is larger\r\n"
					+ "than 120 or less than 3 (you may assume that the values you get are in that range).");
		}
		
	}

}
