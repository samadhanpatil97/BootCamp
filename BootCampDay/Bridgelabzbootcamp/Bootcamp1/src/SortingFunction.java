import java.util.Scanner;
import java.util.StringTokenizer;
  
public class SortingFunction{

	//Utility u=new Utility();
	Scanner sc=new Scanner(System.in);
	StringTokenizer st;
	
	public SortingFunction(){
	}
	
	//Take 1D Array Input
	public int[] input1DArray(int arraySize){
		int array[]=new int[arraySize];
		for(int i=0;i<arraySize;i++){
			System.out.println("Enter array["+i+"] : ");
			array[i]=sc.nextInt();
		}
		return array;
	}
	//Binary Search for String
	public int binarySearchString(String[] names, String key) {
    	int first = 0;
    	int last  = names.length;
 
    	while (first < last) {
        	int mid = (first + last) / 2;
        	if (key.compareTo(names[mid]) < 0) {
           			last = mid;
        	} else if (key.compareTo(names[mid]) > 0) {
            		first = mid + 1;
        	} else {
            		return mid;
        	}
    	}		
    	return -1;
	}
//Bubble Sort for String
	public String[] bubbleSortString(String numbers[])
   	 {
        String temp;
        for(int i = 0; i < numbers.length; i++)
       	{
            for(int j = 1; j < (numbers.length -i); j++)
            {
            	//if numbers[j-1] > numbers[j], swap the elements
        		if(numbers[j-1].compareTo(numbers[j])<0)
    			{
    				temp = numbers[j-1];
   					numbers[j-1]=numbers[j];
    				numbers[j]=temp;
    			}
   		 	}
    	}
		return numbers;
	}
	//Insertion sort for String
	public String[] insertionSortString(String words[]){
		String temp;
		for(int i=1;i<words.length;i++){
			for(int j=i;j>0;j--){
				if(words[j].compareTo(words[j-1])<0){
					temp=words[j];
					words[j]=words[j-1];
					words[j-1]=temp;
				}
				else
					break;
			}
		}
		return words;
	}
	
	//Take Statement And return Array of words
	public static void main(String statement){	
		StringTokenizer st=new StringTokenizer(statement," ");
		String words[]=new String[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()){
			words[i]=st.nextToken();
			i++;
		}
		return;
	}
}