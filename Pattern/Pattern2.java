import java.util.*;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt ();
        int nstars = n;
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= nstars; j++){
                System.out.print("*\t");
            }
            
            nstars--;
            System.out.println();
        }

    }
}