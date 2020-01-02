package com.Bridgelabz.java;

public class MonthlyPayment {

		public static void main(String[] args) {
			
		double P=Double.parseDouble(args[0]);
		int y=Integer.parseInt(args[1]);
		int rate=Integer.parseInt(args[2]);
		
		double result=pay(P,y,rate);
		System.out.println("result is::"+result);

		}
		public static double pay(double p,int Y,int R) {
			System.out.println("R::"+R);
			double n=12*Y;
			System.out.println("n is::"+n);
			double r=R/12*100;
			System.out.println(r);
			double payment=(p*r)/(1-Math.pow(1+r, -n));
			return payment;
			
		}
		

	}


