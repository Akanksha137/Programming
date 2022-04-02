import java.io.*;
import java.util.*;

public class SearchInSorted2d {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [][]arr=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=scn.nextInt();
        }
    } 
   int search = scn.nextInt();
   int i=0;  
  
       for( i=0;i<n;i++){
           if(arr[i][0] <= search && arr[i][n-1] >=  search){
               int li=0;
               int hi=arr[0].length-1;
               while(li<hi){
                   int mid=(li+hi)/2;

                   if(search>arr[i][mid]){
                      li= mid+1;
                   }
                   else if(search<arr[i][mid]){
                      hi= mid-1;
                   }
                   else{
                       System.out.println(i);
                       System.out.println(mid);
                       return;
                   }
               }
               
           }
          
       } System.out.println("Not Found");
   
    }
}