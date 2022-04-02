import java.io.*;
import java.util.*;

public class Goldmine {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int m = scn.nextInt();
       int [][]arr = new int[n][m];
       for(int i=0;i<n ;i++){
            for(int j=0;j<m ;j++){
           arr[i][j]= scn.nextInt();
            }
       }
       
       int [][]dp = new int[n][m];
       
       for(int j=m-1;j>=0 ; j-- ){
           for(int i=n-1 ; i>=0; i--){
            
                if(j == arr[0].length-1){
                  dp[i][j]=arr[i][j];
              }
              else if(i==0){
                  dp[i][j] = Math.max(dp[i+1][j+1]+arr[i][j] , dp[i][j+1]+arr[i][j]);
              }
              else if(i==arr.length-1){
                  dp[i][j] = Math.max(dp[i-1][j+1]+arr[i][j] , dp[i][j+1]+arr[i][j]);
              }
              else{
                  int max = dp[i-1][j+1]+arr[i][j];
                  max = Math.max(max , dp[i][j+1]+arr[i][j]);
                  dp[i][j] = Math.max(max , dp[i+1][j+1]+arr[i][j]);
                  
              }
           }
       }
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n ;i++){
            int j=0;
            max = Math.max(max , dp[i][j]);
       }
       System.out.println(max);
            
    }

}