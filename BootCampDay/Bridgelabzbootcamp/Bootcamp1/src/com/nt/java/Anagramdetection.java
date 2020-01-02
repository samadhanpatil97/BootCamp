package com.nt.java;
import java.util.Scanner;
//import com.suraj.java.Utility;

public class Anagramdetection {

	public static void main(String[] args) {
		 {
			  Scanner sc = new Scanner(System.in);
				//Utility u=new Utility();
				//taking string input
				System.out.println("Enter 1st String: ");  
				//String s=u.inputString();
				  String s=sc.nextLine();
				System.out.println("Enter 2nd String: ");
				//String s1=u.inputString();
				String s1=sc.nextLine();
				//calling function
				Anagram.isAnagram(s, s1);
			}
		}

		}

	


