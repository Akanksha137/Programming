import java.io.*;
import java.util.*;

public class ReverseOfAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a){
    int temp=0;
    int mid=(a.length-1)/2;
    for(int i=0;i<=mid;i++){
        temp=a[i];
        a[i]=a[a.length-1-i];
        a[a.length-1-i]=temp;
    }
    // for(int i=0;i<a.length;i++){
    //     System.out.print(a[i]+"\t");
    // }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);
    display(a);
 }

}