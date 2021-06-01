import java.util.Scanner;
public class LCM{

     public static void main(String []args){
        int i, n1, n2, lcm;
        Scanner s = new Scanner(System.in);
         System.out.println("Enter 1st num");
         n1 = s.nextInt();
         System.out.println("Enter 2nd num");
         
         lcm = (n1 > n2) ? n1 : n2;
         
             while(true) {
                if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
                 }
            ++lcm;
    }
  }
}
         