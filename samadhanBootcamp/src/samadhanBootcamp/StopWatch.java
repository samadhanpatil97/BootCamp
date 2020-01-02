package samadhanBootcamp;

import java.util.Scanner;

public class StopWatch {

	static double start=0, stop=0;
		
     static void StartTime() {
    	 start=System.currentTimeMillis();
    	 System.out.println("started at" +start);
	}
        static void stoptime() {
        	stop =System.currentTimeMillis();
        	System.out.println("stopped at " + stop);
        }
        static void elapsedTime() {
        	System.out.println("elapsed at"+(stop-start)/1000);
        }
        public static void main(String []args) {
        	Scanner sc =new Scanner(System.in);
        	System.out.println(" enter 1 to start");
        	sc.next();
        	StartTime();
        	
        	System.out.println("enter to stop");
        	sc.next();
        	stoptime();
        	elapsedTime();
        	
        }
}
