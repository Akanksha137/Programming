import java.io.*;
import java.util.*;

public class CountSort {

  public static void countSort(int[] arr, int min, int max) {
        int range = max-min;
   int []farray=new int[range+1];
   
   for (int i = 0; i < arr.length; i++) {
      int index = arr[i]-min;
      farray[index]+=1;
      
    }
   for(int i=0;i<farray.length;i++){
       
       if(i>0){
          farray[i]=farray[i-1]+farray[i];
      }
   }
   for(int i=0;i<farray.length;i++){
       farray[i]=farray[i]-1;
   }
   int []narray = new int[arr.length];
   for(int i=arr.length-1;i>=0;i--){
       int index=arr[i]-min;
       narray[farray[index]]=arr[i];
       farray[index]=farray[index]-1;
   }
  
   for (int i = 0; i < arr.length; i++) {
      arr[i]=narray[i];
      
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}