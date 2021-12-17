import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for (int n = low ; n <= high; n++){
            boolean isPrime = true;
            int div = 2;
            while (div * div <= n){
                int r = n % div;
                if (r == 0){
                    isPrime = false;
                    break;
                }
                div++;

            }
            if(isPrime == true){
                System.out.println(n);
            }
        }
    }
}