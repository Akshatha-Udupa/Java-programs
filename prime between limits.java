import java.util.Scanner;
public class Main{

     public static void main(String []args){
        int m, n;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter lower limit");
        m = s.nextInt();
        System.out.println("Enter upper limit");
        n = s.nextInt();
        
        
         for(int i=m; i<=n; i++)
         {
            int temp=1;
             for(int j=2; j<=i/2; j++)
             {
                 if (i%j==0)
                 {
                 temp=0;
                 break;
                 }
             }
             if (temp == 1)
             System.out.println(i);
                
         }
             
            
             
         
         
     }
}
         