import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();

        System.out.println("Here is your pattern....!!!");
        
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
