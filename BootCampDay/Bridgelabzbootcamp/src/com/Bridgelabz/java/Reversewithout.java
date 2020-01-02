package com.Bridgelabz.java;

public class Reversewithout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str = "hello welcome to bridgelabz";
          char chars[] = str.toCharArray();
          for(int i=chars.length-1;i>=0;i--) {
        	  System.out.print(chars[i]);
          }
	}

}
