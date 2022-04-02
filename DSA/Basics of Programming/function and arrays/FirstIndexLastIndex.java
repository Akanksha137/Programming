import java.io.*;
import java.util.*;

public class FirstIndexLastIndex{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n = scn.nextInt();
   int []a=new int[n];
   for(int i=0;i<n;i++){
       a[i]=scn.nextInt();
   }
   int data=scn.nextInt();
   int l=0;
   int h=n-1;
   int first=-1;
   
   while(l<=h){
       int m= (l+h)/2;
       if(data > a[m]){
           l=m+1;
       }
       else if(data < a[m]){
           h=m-1;
       }
       else{
           first=m;
           h=m-1;
       }      

   }
   
   System.out.println(first);
   l=0;
   h=n-1;
  
   int last=-1;
   while(l<=h){
       int m= (l+h)/2;
       if(data > a[m]){
           l=m+1;
       }
       else if(data < a[m]){
           h=m-1;
       }
       else{
           last=m;
           l=m+1;
       }      

   }
   
   System.out.println(last);
 }

}