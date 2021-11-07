import java.io.*;
import java.util.*;

public class BuyAndSellStock5 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
        arr[i] = scn.nextInt();
        }

        int []dpl = new int[n];//dp from left  if bought today
        int lsf = arr[0];//least so far
        int mpist=0;
        for(int i=1;i<n;i++){
            if(arr[i] < lsf){
                lsf= arr[i];
            }
            mpist = arr[i]-lsf ;
            if(mpist>dpl[i-1]){
                 //mpist = arr[i]-lsf;
                 dpl[i] =mpist;
            }
            else{
                dpl[i]=dpl[i-1];
            }
            
        }
        int []dpr = new int[n];//dp right if sold today
        int msf = arr[arr.length-1];//maximum so far
        int max=0;
      for(int i = arr.length-2 ; i>=0;i--){
          if(arr[i] > msf){
              msf = arr[i];
          }

          max = msf -arr[i];
          if(max > dpr[i+1]){
              dpr[i]=max;
          }
          else{
              dpr[i] = dpr[i+1];
          }
      }

    int op=0;
    for(int i=0;i<n;i++){
        if(dpl[i]+dpr[i] > op){
            op = dpl[i]+dpr[i];
        }
    }
    System.out.println(op);

    }

}