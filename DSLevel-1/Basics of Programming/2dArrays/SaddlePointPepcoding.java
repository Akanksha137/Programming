import java.io.*;
import java.util.*;

public class SaddlePointPepcoding {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [][]arr=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=scn.nextInt();
        }
    } 
    for(int i=0;i<n;i++){
        int svj=0;
        for(int j=1;j<n;j++){
            if(arr[i][j]<arr[i][svj]){
                arr[i][svj]=arr[i][j];
                svj=j;
            }
        }
    boolean flag=true;
        for(int k=0;k<n;k++){
            if(arr[k][svj]>arr[i][svj]){
                flag=false;
            }
        }
        if(flag==true){
            System.out.println(arr[i][svj]);
            return;
        }
    } 
    System.out.println("Invalid input");
    }
}