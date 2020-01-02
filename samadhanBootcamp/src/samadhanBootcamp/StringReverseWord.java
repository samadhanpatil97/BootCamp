package samadhanBootcamp;

public class StringReverseWord {

	public static String reverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  
public static void main(String[] args) {  
    System.out.println(StringReverseWord.reverseWord("my name is khan"));  
    System.out.println(StringReverseWord.reverseWord("I am sonoo jaiswal"));    
    }  
}
