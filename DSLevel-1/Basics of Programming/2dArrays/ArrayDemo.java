import java.io.*;
import java.util.*;

public class ArrayDemo{

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
    for(int i=0;i<n;i++){
       for(int j=0;j<m;j++){
           System.out.print(a[i][j]+"\t");
       }
       System.out.println();
   }
 }

}