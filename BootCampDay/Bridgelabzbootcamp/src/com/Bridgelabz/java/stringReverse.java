package com.Bridgelabz.java;

public class stringReverse {

	public void reverseWordInMystring(String str) {
		String[] words = str.split(" ");
		String reversedstring =" ";
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String reverseword = " ";
			
			for(int j=word.length()-1;j>=0;j--) {
				reverseword = reverseword + word.charAt(j);
			}
			reversedstring = reversedstring + reverseword+ "";
		}
		System.out.println(str);
		System.out.println(reversedstring);

	}
	    public static void main(String [] args) {
	    	stringReverse obj = new stringReverse();
	    	obj.reverseWordInMystring("hello welcome to bridgelabz");
	    }

}
