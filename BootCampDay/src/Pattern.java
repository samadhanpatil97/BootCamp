import java.util.Scanner;

public class Pattern {
	public static void main(String args[])
	{ 
			for(int i=1;i<=4;i++)
			{
				for(int j=4;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
			
			for(int i=1;i<=4;i++)
			{
				for(int j=1-1;j<=i;j++)
				{
					System.out.print(" ");
				}
				for(int k=3;k>=i;k--)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
		  
	}
}