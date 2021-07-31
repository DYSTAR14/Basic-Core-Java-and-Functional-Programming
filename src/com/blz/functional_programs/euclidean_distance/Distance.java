package com.blz.functional_programs.euclidean_distance;

public class Distance {

	public static double euclideanDistance(int x,int y,int aOrigin,int bOrigin) {
		double distance=Math.sqrt(Math.pow(x-aOrigin,2)+Math.pow(y-bOrigin,2));
		return distance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int aOrigin=0,bOrigin=0;
		System.out.println(x+" "+y);
		double distance=euclideanDistance(x,y,aOrigin,bOrigin);
		System.out.println("Euclidean distance : "+String.format("%.4f",distance));
	}

}
