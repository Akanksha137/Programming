import java.io.*;
import java.util.*;

public class SpiralDisplay {

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
        int istart=0,iend=n-1,jstart=0,jend=m-1;
        while(istart<n && iend>=0 && jstart <m && jend >=0){
       for(int i=istart;i<=iend;i++){
           for(int j=jstart;j<=jend;j++){
               if(j==jstart){
                   System.out.println(a[i][j]);
               }
               if(i==iend && j>jstart){
                   System.out.println(a[i][j]);
               }
           }           
       }
       ++jstart;
       --iend;
       for(int i=iend;i>=istart;i--){
           for(int j=jend;j>=jstart;j--){
               if(j==jend){
                System.out.println(a[i][j]);
                
               }
               if(i==istart && j<jend){
                   System.out.println(a[i][j]);
               }
           }
       }
       ++istart;
       --jend;
    }
    }
}