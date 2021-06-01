/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main{

     public static void main(String []args){
        int i, n1, n2, gcd=1;
        Scanner s = new Scanner(System.in);
         System.out.println("Enter 1st num");
         n1 = s.nextInt();
         System.out.println("Enter 2nd num");
         n2 = s.nextInt();
         gcd = fungcd(n1, n2);
         int lcm = (n1 * n2)/gcd;
         System.out.println("GCD of "+ n1 + " and " + n2 + " is " + gcd);
         System.out.println("LCM is " + lcm);
     }
     
          //function GCD
            static int fungcd(int x, int y) 
            {
                if (y == 0) {
  	                return x;
                    }
                else {
                    return fungcd(y, x % y);
                    }     
            }
        
}