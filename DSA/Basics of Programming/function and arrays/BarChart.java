import java.util.*;
import java.io.*;

public class BarChart{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max=maxfunc(arr,n);
        for(int i=0;i<max;i++){
            for(int j=0;j<n;j++){
                if(i<(max-arr[j])){
                    System.out.print(" \t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }

    }

    static int maxfunc(int []arr,int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i])
            max=arr[i];
        }
        return max;
    }
}