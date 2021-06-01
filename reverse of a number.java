/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    int n, rem, rev=0;
    System.out.println("Enter a number");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    
    while(n>0)
    {
        rem = n % 10;
        rev = rev * 10 + rem;
        n = n/10;
    }

     System.out.println(rev);
    }

}
