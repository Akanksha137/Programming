import java.util.*;
import java.io.*;
public class ExitPoint{
    public static void main(String[] args) throws Exception{
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]a=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=scn.nextInt();
            }
        }
        int i=0;
        int j=0;
        int exitr=-1;
        int exitc=-1;
        int cnt=0;
        while(cnt==0)
        {       
       //right
       for(;j<m && cnt==0;){       
          if(a[i][j]==0 && j==m-1){
              exitr=i;
              exitc=j;
              cnt=1;
              break;
           }
           else if(a[i][j]==1){
               ++i;
               break;
           } 
           else{++j;}
           
       }

       //down
        for(;i<n && cnt==0;){  
             if(a[i][j]==0 && i==n-1){
                exitr=i;
                exitc=j;
                cnt=1;
                break;
            }  
           else  if(a[i][j]==1){
                --j;
                break;
            }
         
           else{
               ++i;
           }        
        }

       //left
       for(;j>=0 && cnt==0;){  
            if(a[i][j]==0 && j==0){
                exitr=i;
                exitc=j;
                cnt=1;
                break;
            } 
            else if(a[i][j]==1){
                --i;
                break;
            }
           
            else{
                --j;
            }
       }

       //top
       for(;i>=0&& cnt==0;){ 
             if(a[i][j]==0 && i==0){
                exitr=i;
                exitc=j;
                cnt=1;
                break;
            } 
            else if(a[i][j]==1){
                ++j;
                break;
            }
           
            else{
                --i;
            }
       } 
        }
        System.out.println(exitr);
        System.out.println(exitc);
    }
}