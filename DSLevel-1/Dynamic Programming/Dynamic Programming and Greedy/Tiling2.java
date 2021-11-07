import java.io.*;
import java.util.*;

public class Tiling2 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int []dp = new int[n+1];
        dp[1]=1;
       
        
        for(int i=2 ; i<=n;i++){
            if(i>m){
           dp[i] = dp[i-1]+dp[i-m]; 
            }
            else if(i == m){
                dp[m]=2; 
            }
            else{
                dp[i]=dp[i-1];
            }
        }
        
        System.out.println(dp[n]);
        
    }
}