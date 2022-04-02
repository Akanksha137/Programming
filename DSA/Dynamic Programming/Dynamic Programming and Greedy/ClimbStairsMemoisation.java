import java.io.*;
import java.util.*;

public class ClimbStairsMemoisation {

    public static void main(String[] args) throws Exception {
       Scanner scn =  new Scanner(System.in);
       int n = scn.nextInt();
       int csr = climbStairs(n , new int[n+1]);
       System.out.println(csr);
    }
    
    public static int climbStairs(int n , int[]qb){
        if(n==0){
            return 1;

        }
        else if(n<0){
            return 0;
        }


        if(qb[n]!=0){
            return qb[n]; 
        }
        int nm1 = climbStairs(n-1 , qb);
        int nm2 = climbStairs(n-2 , qb);
        int nm3 = climbStairs(n-3 , qb);
        int csr = nm1 + nm2 + nm3;
        qb[n]=csr;
        return qb[n];

    }
}