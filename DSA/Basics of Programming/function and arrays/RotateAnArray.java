import java.io.*;
import java.util.*;

public class RotateAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    k=k%a.length;  
    if(k<0){
        k=k+a.length;
    }
    int []a1=new int[a.length-k];
    int []a2=new int[k];
    for(int i=0,j=0;i<a.length;i++){
        if(i<a.length-k){
            a1[i]=a[i];
        }
        else{
            a2[j++]=a[i];
            
        }
    }
    reverse(a1);
    reverse(a2);
    for(int i=0,j=0,n=0;i<a.length;i++){
        if(i<a.length-k){
            a[i]=a1[j];
            j++;
        }
        else{
            a[i]=a2[n];
            n++;
        }
    }
    reverse(a);
  }

  public static void reverse(int []a){
      int temp=0;
      for(int i=0;i<a.length/2;i++){
          temp=a[i];
          a[i]=a[a.length-1-i];
          a[a.length-1-i]=temp;
      }
  }


public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}