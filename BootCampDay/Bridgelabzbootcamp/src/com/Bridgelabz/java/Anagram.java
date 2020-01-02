package com.Bridgelabz.java;
import java.util.Scanner;
public class Anagram {

	       public static void main(String[] args) {
			String str1,str2;
			int len,len1,len2,i,j,found=0,Not_found=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter first string");
			str1 = sc.nextLine();
			System.out.println("enter second string");
			str2 = sc.nextLine();
			
			len1= str1.length();
			len2 = str2.length();
			
			if(len1==len2) {
				len=len1;
				for( i=0;i<len;i++) {
					found = 0;
					for(j=0;j<len;j++) {
						  if(str1.charAt(i) == str2.charAt(j))
		                    {
		                        found = 1;
		                        break;
		                    }
		                }
		                if(found == 0)
		                {
		                    Not_found = 1;
		                    break;
		                }
		            }
		            if(Not_found == 1)
		            {
		                System.out.print("Strings are not Anagram to Each Other..!!");
		            }
		            else
		            {
		                System.out.print("Strings are Anagram");
		            }
		        }
		        else
		        {
		            System.out.print("Both Strings Must have the same number of Character to be an Anagram");
		        }
		    }
		}

					
				
			
			

		



