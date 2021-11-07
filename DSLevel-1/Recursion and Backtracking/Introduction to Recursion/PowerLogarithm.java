import java.io.*;
import java.util.*;

public class PowerLogarithm {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int x = scn.nextInt();
       int n = scn.nextInt();
       System.out.println(power(x , n));
    }

    public static int power(int x, int n){
       
         if(n==0){
            return 1;
        }
         int xpn = power(x , n/2);
        int xn = xpn * xpn;
         if(n%2 == 1 ){
            return xn * x;
        }
        return xn;
       
        
    }

}