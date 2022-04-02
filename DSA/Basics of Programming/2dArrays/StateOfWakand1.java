import java.io.*;
import java.util.*;

public class StateOfWakand1{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int m=scn.nextInt();
    int [][]a=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=scn.nextInt();
        }
    }
    for(int i=0;i<m;i++){       
            for(int j=0;j<n;j++){
            if(i%2==0){
            System.out.println(a[j][i]);
            }
            else{
                System.out.println(a[n-j-1][i]);
            }
         }
    }
 }

}