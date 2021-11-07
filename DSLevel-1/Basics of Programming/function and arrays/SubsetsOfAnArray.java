import java.io.*;
import java.util.*;

public class SubsetsOfAnArray{

public static void main(String[] args) throws Exception {
   Scanner scn=new Scanner(System.in);
   int n=scn.nextInt();
   int []a=new int[n];
   for(int i=0;i<n;i++){
       a[i]=scn.nextInt();
   }
   for(int i=0;i<(int)Math.pow(2,n);i++){
     int temp=i;
     String set="";
     for(int j=n-1;j>=0;j--){
       int r=temp%2;
       temp=temp/2;
       if(r==0){
         set="-\t" +set;
       }else{
         set=a[j]+"\t"+set;
       }
     }
     System.out.println(set);
   }       
 }
}