import java.util.Scanner;
public class Main{  
public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a binary no");
    String binaryString=s.next();  
    int decimal=Integer.parseInt(binaryString,2);  
    System.out.println("Decimal of " + binaryString +" is "+ decimal);  
}
    
}  