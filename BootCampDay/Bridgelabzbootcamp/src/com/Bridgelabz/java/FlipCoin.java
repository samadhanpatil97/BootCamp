package com.Bridgelabz.java;
import java.util.Scanner;
public class FlipCoin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of times to flip coin ::");
		int n = sc.nextInt();
		int tail=0; int head=0;
		for(int i=0;i<n;i++) {
			double result =Math.random();
			System.out.println("random number are:: "+result);
			
			if(result<0.5) {
				tail++;
			}
			else {
				head++;
			}
		}
		double tailpercent = (tail*100)/n;
		double headpercent = (head*100)/n;
		
		System.out.println("Tail percentage is" +tailpercent);
		System.out.println("head percentage is" +headpercent);
		
		sc.close();

	}

}
