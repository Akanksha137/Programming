import java.io.*;
import java.util.*;

public class FractionalKnapsack {

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
		
        double [][]dp = new double[n+1][bag+1];
        for(int i=1;i<=n;i++){
            double max= 0;
            for(int j=1;j<=bag;j++){
                if(j<w[i-1]){
                    double fract =(double)(v[i-1]) * j/w[i-1];
                    max =Math.max(dp[i-1][j],fract);
                }
                else{
                    
                    if(w[i-1]>=w[i-2]){
                        double fract =(double)(v[i-1]) * j/w[i-1];
                        max = Math.max(dp[i-1][j] , fract );
                    }
                    else{
                        max = Math.max(dp[i-1][j], v[i-1] + dp[i-1][j-w[i-1]]);
                    }
                }

                








            dp[i][j]=max;
            }
             
        }

        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=bag;j++){
        //         System.out.print(dp[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
       System.out.println(dp[n][bag]);

        
	}
}