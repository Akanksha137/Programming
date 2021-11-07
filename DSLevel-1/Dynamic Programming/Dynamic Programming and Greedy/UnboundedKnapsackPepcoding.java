import java.io.*;
import java.util.*;

public class UnboundedKnapsackPepcoding {

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
		int[]dp= new int[bag+1];
        
        for(int i=1;i<=bag;i++){
            int max=0;
            for(int j=0;j<n;j++){
                if(i>=w[j]){
                    int cap=dp[i-w[j]]+v[j];
                    if(cap>max){
                        max=cap;
                    }
                    
                }
            }
            dp[i]=max;
        }
        
        System.out.println(dp[bag]);
	}
}