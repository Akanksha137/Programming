import java.io.*;
import java.util.*;
public class BuyAndSellStock3 {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int fee = scn.nextInt();

   int obsp = -arr[0];
   int ossp = 0;
   for(int i=1;i<n;i++){
       int nbsp =0;
       int nssp = 0;
       if(ossp-arr[i] >obsp){
           nbsp = ossp - arr[i];
       }
       else{
           nbsp = obsp;
       }
       
       
       if(arr[i] + obsp - fee > ossp ){
           nssp = arr[i]+obsp-fee;
       }
       else{
           nssp = ossp;
       }
       
       obsp = nbsp;
       ossp = nssp;
   }
   
   System.out.println(ossp);
  }

}