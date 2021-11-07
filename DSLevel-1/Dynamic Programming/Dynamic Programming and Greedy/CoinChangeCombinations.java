import java.io.*;
import java.util.*;

public class CoinChangeCombinations {

    public static void main(String[] args) throws Exception {
         
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int[]arr = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int ele = scn.nextInt();
        
        int []dp= new int[ele+1];
        dp[0]=1;
       for(int j=0;j<arr.length;j++){
       for(int i=1;i<=ele;i++){
          if(i-arr[j]<0){
              dp[i]+=0;
          }
          
          else{
               dp[i]+=dp[i-arr[j]];
          }
       }
       }
       System.out.println(dp[ele]);
    }
}