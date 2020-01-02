import java.util.Arrays;
import java.util.Scanner;

public class Example 
{
	public static void main(String[] args) {    
	    //int year=2020;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
	    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
	        System.out.println("LEAP YEAR");  
	    }  
	    else{  
	        System.out.println("COMMON YEAR");  
	    }  
	}    
	}    
	