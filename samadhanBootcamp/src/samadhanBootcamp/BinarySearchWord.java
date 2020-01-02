package samadhanBootcamp;

import java.util.*;
	import java.util.Arrays;

public class BinarySearchWord {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of words you wish to input");
		int n=sc.nextInt();
		
		String[] words=new String[n];
		
		System.out.println("Enter the word");
		for(int i=0;i<words.length;i++)
		{
			System.out.print("WORD"+(i+1)+":");
			words [i]=sc.next();
		}
		System.out.println("Enter the words you want to search");
		String word=sc.next();
		
		Arrays.sort(words);
		
		int index=Arrays.binarySearch(words, word);
		System.out.println(word+"="+index);
	}
}