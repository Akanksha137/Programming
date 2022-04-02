import java.io.*;
import java.util.*;

public class TargetSumPair1 {

  public static void targetSumPair(int[] arr, int target){
      int []sorted=  mergeSort(arr, 0,arr.length-1);
      int i=0;
      int j=sorted.length-1;
      while(i<j){
        int sum = sorted[i]+sorted[j];
        if(sum>target){
          j--;
        }
        else if(sum < target){
          i++;
        }
        else{
          System.out.println(sorted[i]+", "+sorted[j]);
          i++;
          j--;
        }
      }
    
  }
  public static int[] mergeSort(int[]arr , int lo , int hi){
      int mid = (lo+hi)/2;
      if(lo>hi){
        return new int[0];
      }
      if(lo==hi){
        int []first = new int[1];
        first[0]=arr[lo];
        return first;
      }
      int[] first = mergeSort(arr,lo,mid);
      int[]second=mergeSort(arr,mid+1,hi);
      int[]newarr=mergeTwoSortedArrays(first,second);
    
      return newarr;
  }

  public static int[] mergeTwoSortedArrays(int[]first , int[]second){
      int n = first.length + second.length;
      int []sorted = new int[n];
      int i=0;
      int j=0;
      int k=0;
      while(k<n){
        while(i< first.length && j<second.length){
          if(first[i]<second[j]){
            sorted[k] = first[i];
            i++;
          }
          else{
            sorted[k]=second[j];
            j++;
          }
          k++;
        }

        while(i<first.length){
          sorted[k]=first[i];
          i++;
          k++;
        }
        while(j<second.length){
          sorted[k]=second[j];
          j++;
          k++;
        }
      }
      return sorted;
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}