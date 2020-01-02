package samadhanBootcamp;


import java.util.Scanner;

public class FindVowels  {
	 public static void main(String [] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a string");
		 String s =sc.nextLine();
		 System.out.println("vowels in a string are");
		 vowels(s);
	 }
	 static void vowels(String str) {
		 int count=0;
		 char ch;
		 int i=0;
		 for(int j=0;j<str.length();j++) {
			 ch=str.charAt(j);
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') { 
				 i=1;
				 count++;
				
				 System.out.println(ch);
		 }
				
		 }	  
 
		 System.out.println("total vowels in string : ");
		 System.out.println(count);
		 
		 
		 if(i==0)
			 System.out.println("there are no vowels in a string");
	 }

	 }

