import java.util.Scanner;
public class Main{

     public static void main(String []args){
        int n, temp=0;
        Scanner s = new Scanner(System.in);
         System.out.println("Enter  num");
         n = s.nextInt();
         for ( int i=2; i<n; i++)
         {
             if (n%i==0)
             {
                 temp=0;
                 break;
             }
             else
             {
             temp=1;
             }
         }
         if(temp==0)
         System.out.println(n + " is not prime");
         else
         System.out.println(n + " is prime");
     }
}
         