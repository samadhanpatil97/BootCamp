package com.Bridgelabz.java;

public class BitSequenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("testing our countBits() method with bit seq ");
        
        String [] input = {"0000","00100"};
        
        for(int i=0;i<input.length;i++) {
        	int binary = Integer.parseInt(input[i],2);
        	int count = CountBits(binary);
        	
        	System.out.println("bit sequence:" +input[i]+"number of 1's :" +count);
        }
	}
        public static int CountBits(int number) {
        	if(number==0) {
        		return number;
        	}
        	int count=0;
        	while(number!=0) {
        		number&= (number-1);
        		count++; 
        	}
        	return count;
        }
}
