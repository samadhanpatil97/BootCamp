package com.Bridgelabz.java;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int year = sc.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) 
			System.out.println("specific year is leap year");
		else
			System.out.println("specific year is not leap year");
		}
		

	}


