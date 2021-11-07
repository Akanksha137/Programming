import java.util.*;
import java.io.*;
public class SumOfTwoArrays{
    public static void main(String[] args){
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

        int max=n1;
        if(n2>n1){
            max=n2;
        }
        int []arr3=new int[max];
        int c=0;
        int temp1=n1;
        int temp2=n2;
        while(temp1>0 || temp2>0){         

            if(temp1>0){
                arr3[max-1]=arr1[temp1-1];
            }
            if(temp2>0){
                arr3[max-1]+=arr2[temp2-1];
            }
            arr3[max-1]=arr3[max-1]+c;
            if(arr3[max-1]>9){
                
                c=arr3[max-1]/10;
                arr3[max-1]%=10;
            }  
            else{
                c=0;
            }
            max--;
            temp1--;
            temp2--;
        }
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}