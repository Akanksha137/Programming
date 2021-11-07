import java.util.*;
import java.io.*;
public class RotateBy90Pepcoding{
    public static void main(String[] args) throws Exception{
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();      
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        int i=0;
        while(i<n){
        int li=0;
        int ri=arr[0].length-1;
        while(li<ri){
            int temp=arr[i][li];
            arr[i][li]=arr[i][ri];
            arr[i][ri]=temp;
            li++;
            ri--;

        }i++;
        }
        display(arr);
    }
     public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}