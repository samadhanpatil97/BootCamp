package samadhanBootcamp;

import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  
	  System.out.println("enter a stake");
	  int stake =sc.nextInt();
	  System.out.println("enter a goal");
	  int goal =sc.nextInt();
	  System.out.println("enter a noOfTimes");
	  int noOfTimes =sc.nextInt();
	  
	  int bets=0;
	  int wins=0;
	  for(int i=0;i<noOfTimes;i++) {
		   int cash = stake;
		   while(cash<0 && cash>goal) {
			   bets++;
			   
			   if(Math.random()<0.5) 
				   cash++;
			   
			   else 
				   cash--;
		   }
			   if(cash==goal) 
				   wins++;
			   
		   }
		  
	  
            System.out.println();
            System.out.println(wins+ " wins of "+noOfTimes);
            System.out.println("percentage of games won"+ 100.0*wins/noOfTimes);
            System.out.println("Avg of bets"+ 1.0* bets/noOfTimes);
	}

}
