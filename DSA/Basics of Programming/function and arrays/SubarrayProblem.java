import java.io.*;
import java.util.*;

public class SubarrayProblem{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=scn.nextInt();
    }
    int temp=0;
    for(int i=0;i<n;i++){
        for(int j=temp;j<i+1;j++){
            System.out.print(a[j]+"\t");
        }

        if(i==n-1){
           i=temp; 
           ++temp;
        }
        System.out.println();
        
    }
 }
}