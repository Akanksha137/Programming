import java.io.*;
import java.util.*;

public class OneTransactionAllowedPepcoding {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int[]prices = new int[n];
       for(int i=0;i<n;i++){
           prices[i] = scn.nextInt();
       }

       int lsf = Integer.MAX_VALUE;//least so far
        int op=0; //overall rofit
        int pist = 0; //profit if sold today
       
       for(int i=0;i<n;i++){
           if(lsf>prices[i]){
               lsf=prices[i];
           }
           pist = prices[i] - lsf;
           if(pist > op){
               op=pist;
           }

       }
       System.out.println(op);

    }

}