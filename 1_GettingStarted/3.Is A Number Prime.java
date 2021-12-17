import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t = scn.nextInt();
       for (int i = 1; i <= t; i++ ) {
           int n = scn.nextInt();
           boolean isprime = true;
           int div = 2;
           while (div * div <= n) {
               int remainder = n % div;
               if (remainder == 0){
                   isprime = false ;
                   break ;
               }
               div++;
           }
           if (isprime == true) {
               System.out.println ("prime");

           }else {
               System.out.println ("not prime");

           }
       }
  
   }
  }