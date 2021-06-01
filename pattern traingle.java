import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      int i, rows, space, k=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no of rows::");
      rows = sc.nextInt();
     

      for (i = 1; i<=rows; ++i, k=0)
      {
         for (space = 1; space<=rows-i; ++space)
         {
             System.out.print("  ");
         }
         while(k!=2*i-1)
         {
             System.out.print("* ");
             ++k;
         }
            System.out.println();
      }
  
   }
}