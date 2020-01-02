package com.Bridgelabz.java;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temp");
		double t = sc.nextDouble();
		System.out.println("enter wind");
		double v = sc.nextDouble();
		//double t = Double.parseDouble(args[1]);
		//double v = Double.parseDouble(args[2]);
		double w = 35.74 + 0.6215*t + (0.4275*t + 35.75 ) * Math.pow(v,0.16);
          
		System.out.println("Temperature = " +t);
		System.out.println("wind speed = " +v);
		System.out.println("wind chill = " +w);
	}

}
