import java.util.Scanner;

public class PowersOfTwo
{
	
	public static void main(String args[])
	{
		//int n=10;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter of number");
		int n=sc.nextInt();
		int i=0;
		int power=1;
		
		System.out.println("power of 2 that are less than 2^"+n);
		
		while(i<=n)
		{
			System.out.println("2^"+i+"="+power);
			power=power * 2;
			i++;
		}
	}
}
