import java.util.*;

public class Pattern14 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for ( int i =1 ; i <= 10; i++){
            int val = n * i;
            System.out.println(n + " * " + i +  " = " + val);
        }
        

    }
    
}