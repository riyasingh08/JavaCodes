import java.util.*;

public class Pattern3{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nsp= n-1;
        int nstars = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nsp; j++){
                System.out.print("\t");
            }
            
            for(int j = 1; j <= nstars; j++){
                System.out.print("*\t");
                
            }
            System.out.println();
            nsp --;
            nstars++;
        }

    }
}