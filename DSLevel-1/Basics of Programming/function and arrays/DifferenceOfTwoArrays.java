import java.util.*;
import java.io.*;
public class DifferenceOfTwoArrays{
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);

        int n1=scn.nextInt();
        int []arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }
        
        int n2=scn.nextInt();
        int []arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }

        int []arr3=new int[n2>n1?n2:n1];
        int b=0;//borrow
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=arr3.length-1;
       
        while(k>=0){         
            int d=b;
            if(j>=0){
                d+=arr2[j];
            }
            if(i>=0){
                d-=arr1[i];
            }
            if(d<0){
                d+=10;
                b=-1;
            }
            else{
                b=0;
            }
             
            arr3[k]=d;
            i--;
            j--;
            k--;

        }
        int idx=0;
        while(arr3[idx]==0){
            ++idx;
        }
        for(int l=idx;l<arr3.length;l++){
            System.out.println(arr3[l]);
        }
    }
}