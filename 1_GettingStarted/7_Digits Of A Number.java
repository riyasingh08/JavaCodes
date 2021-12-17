import java.util.*;
    
import java.util.*;
    
    public class Main {
    
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
    
            int div = 1;
            int temp = n;
            while (temp >= 10) {
                temp /= 10;
                div *= 10;
            }
    
            temp = n;
            while(div >=  1){
                int q = temp / div;
                System.out.println(q);
    
                temp = temp % div;
                div = div / 10;
            }
        }
    }