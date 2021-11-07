import java.io.*;
import java.util.*;

public class OneTransactionAllowed {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int[]arr = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = scn.nextInt();
       }

       int[]dp = new int[n];
       int  min = arr[0];
       for(int i=1;i<n;i++){
           int val = Math.max(dp[i-1] , (arr[i]-min));
           dp[i]=val;
          
           min = Math.min(min , arr[i]);
       }
       System.out.println(dp[n-1]);

    }

}