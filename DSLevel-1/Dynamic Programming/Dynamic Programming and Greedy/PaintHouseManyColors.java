import java.io.*;
import java.util.*;

public class PaintHouseManyColors {

    public static void main(String[] args) throws Exception {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();
        int[][]arr = new int[n][c];
        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int[][]dp = new int[n][c];
        
        for(int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<c;j++){
               if(i==0){
                   dp[i][j] =arr[i][j];
               }
               else{
                    
               }
            }
        }
    }
}