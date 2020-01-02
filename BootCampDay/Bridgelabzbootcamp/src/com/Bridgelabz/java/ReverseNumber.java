package com.Bridgelabz.java;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int n,reverse = 0;
		System.out.println("enter an integer to reverse");
		Scanner in =  new Scanner(System.in);
		n=in.nextInt();
		
		while(n!=0) {
			reverse = reverse * 10+(n%10);
			n = n/10;
		}
        System.out.println("reverse of the number is " +reverse);
	}

}
