package com.Bridgelabz.java;
import java.util.Scanner;
   public class vendingMachine {
		static int notes[]= {2000,1000,500,100,200,50,20,10,5,2,1};
		 static int i,total;
		public static void notes(int value) {
			if(value/notes[i]!=0) {
				total=total+value/notes[i];
				System.out.println("notes of" +notes[i]+"is "+value/notes[i]);
				value=value%notes[i];
				
			}
			i++;
			if(value==0) {
				System.out.println("total notes are::"+total);
				return;
			}
			notes(value);
		
			
		}
		
		

		

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter value::");
			int value=sc.nextInt();
			notes(value);

		}

	}


