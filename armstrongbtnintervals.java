import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      int m, n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number ::");
      m = sc.nextInt();
      System.out.println("Enter the second number ::");
      n = sc.nextInt();

      for (int i = m; i<n; i++){
         int check, rem, sum = 0;
         check = i;
         while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
         }
         if(sum == i){
            System.out.println(""+i+" is an Armstrong number.");
         }
      }
   }
}