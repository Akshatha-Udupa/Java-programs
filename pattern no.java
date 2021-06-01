import java.util.Scanner;
public class Main{

     public static void main(String []args){
        int i, j, n, c=1;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rows");
        n = s.nextInt();
        
        for (i=1; i<=n; ++i)
         {
            for( j=1; j<=i; ++j)
             {
                 System.out.print(c+"\t");
                 c++;
             }
             System.out.println("\n");
                
         }
             
         
     }
}
         