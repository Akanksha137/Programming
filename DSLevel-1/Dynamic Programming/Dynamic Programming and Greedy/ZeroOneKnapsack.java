import java.io.*;
import java.util.*;

public class ZeroOneKnapsack {

    public static void main(String[] args) throws Exception {
         
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []v = new int[n];
    for(int i=0;i<n;i++){
     v[i]=scn.nextInt();   
    }
    int []w = new int[n];
    for(int i=0;i<n;i++){
     w[i]=scn.nextInt();   
    }
    int bag = scn.nextInt();    
    int [][]dp = new int[n+1][bag+1];    
    for(int i=0;i<=n;i++){        
        for(int j=0;j<=bag;j++){
            if(i==0 || j==0){
             dp[i][j]=0;
         }   
          else{
            if(j>=w[i-1]){
                dp[i][j]= Math.max(dp[i-1][j],v[i-1]+dp[i-1][j-w[i-1]]);                  
            }
            else{
                dp[i][j]=dp[i-1][j];
            }
        }               
       }
    }
    System.out.println(dp[n][bag]);    
    }
}