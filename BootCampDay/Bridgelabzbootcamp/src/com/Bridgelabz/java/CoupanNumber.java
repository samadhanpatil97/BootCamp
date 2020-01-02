package com.Bridgelabz.java;

public class CoupanNumber {
	public static void main(String [] args) {
		char chars[] = "abcdefgABCDEFG".toCharArray();
		int max=1000;
		int random = (int)(Math.random()*max);
		StringBuffer sb = new StringBuffer();
		
		while(random>0) {
			sb.append(chars[random%chars.length]);
			random/=chars.length;
		}
		String CoupanCode = sb.toString();
		System.out.println("CoupanCode " +CoupanCode);
	}

}
