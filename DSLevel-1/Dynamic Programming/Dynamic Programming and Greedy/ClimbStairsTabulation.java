import java.io.*;
import java.util.*;

public class ClimbStairsTabulation {

    public static void main(String[] args) throws Exception {
       Scanner scn =  new Scanner(System.in);
       int n = scn.nextInt();
       int csr = climbStairs(n);
       System.out.println(csr);
    }
    
    public static int climbStairs(int n ){
        
        int []dp = new int [n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                 dp[i] = dp[i-1];
            }
            else if(i==2){
                 dp[i] = dp[i-1]+dp[i-2];
            }
            else{
                 dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }
}