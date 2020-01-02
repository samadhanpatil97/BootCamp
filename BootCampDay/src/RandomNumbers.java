
import java.util.*;

class RandomNumbers {
  public static void main(String[] args) {
    //int c;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    Random t = new Random();

    // random integers in [0, 100]

    for (int i = 1; i <= n; i++) {
      System.out.println(t.nextInt(50));
    }
  }
}